package by.ita.telegram.bot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.api.methods.BotApiMethod;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.*;
import org.telegram.telegrambots.api.objects.inlinequery.ChosenInlineQuery;
import org.telegram.telegrambots.api.objects.inlinequery.InlineQuery;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleBot extends TelegramLongPollingBot implements MessageSender{
    private final static Logger LOG= LoggerFactory.getLogger(SimpleBot.class);
    private final static Map<Integer,Integer>chat_events=new ConcurrentHashMap<Integer,Integer>();
    private final EventProcessor processor=new EventProcessor(this);
    public SimpleBot() {
        super();
    }

    /**
     * Метод для приема сообщений.
     * @param update Содержит сообщение от пользователя.
     */
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()){
            Message m=update.getMessage();
            if (m.getChat().isUserChat()){
                processor.onUserMessage(m);
            }else if (m.getChat().isGroupChat()){
                processor.onGroupMessage(m);
            }else if (m.getChat().isChannelChat()){
                processor.onChannelMessage(m);
            }else{
                String message = m.getText();
                String chatId =m.getChatId().toString();
                LOG.info("hasMessage: {} {}",chatId,message);
                LOG.info("hasMessage: {} {} caption:",chatId,message,m.getCaption());
                LOG.info("hasMessage: {} {} from:{} {} ({})",chatId,message,m.getFrom().getFirstName(),m.getFrom().getLastName(),m.getFrom().getUserName());
            }



        }
        if (update.hasChannelPost()){
            processor.onChannelPost(update.getChannelPost());
        }
        if (update.hasCallbackQuery()){
            CallbackQuery q=update.getCallbackQuery();
            processor.onCallbackQuery(q,this.checkoutMenu(q.getData()));
        }
        if (update.hasInlineQuery()){
            InlineQuery q=update.getInlineQuery();
            processor.onInlineQuery(q);
        }
        if (update.hasChosenInlineQuery()){
            ChosenInlineQuery q=update.getChosenInlineQuery();
            processor.onChosenInlineQuery(q);
        }

    }

   @Override
    public synchronized void sendReply(Message m,String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(m.getChatId());
        sendMessage.setReplyToMessageId(m.getMessageId());
        sendMessage.setText(s);
        send(sendMessage);
    }

    @Override
    public synchronized void sendMessage(long chatId,String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);
        send(sendMessage);
    }

    @Override
    public synchronized void sendMenu(long chatId,Class<? extends TegramMenu> menu) {
        if (menu!=null){
            SendMessage sendMessage = new SendMessage();
            sendMessage.enableMarkdown(true);
            sendMessage.setChatId(chatId);
            sendMessage.setText("Выбирайте действие");
            InlineKeyboardMarkup keyboard=new InlineKeyboardMarkup();
            List<InlineKeyboardButton> keyboardLine = new ArrayList<InlineKeyboardButton>();
            //kk.add(new KeyboardButton("Ататата"));

            InlineKeyboardButton button;
            if (menu.isEnum()){
                TegramMenu[] items=menu.getEnumConstants();
                if (items!=null){
                    for(TegramMenu item:items){
                        button=new InlineKeyboardButton(item.getLabel());
                        button.setCallbackData(menu.getName()+':'+item.toString());
                        keyboardLine.add(button);
                    }
                }
            }else{
                return;
            }


            keyboard.getKeyboard().add(keyboardLine);

            sendMessage.setReplyMarkup(keyboard);
            send(sendMessage);
        }
    }

    private TegramMenu checkoutMenu(String d) {
        if (d != null) {
            String[] data = d.split(":");
            if (data != null && data.length > 1 && data[0] != null && data[1] != null) {
                try {
                    Class obj = Class.forName(data[0]);
                    if (obj != null && obj.isEnum()) {
                        for (Object o : obj.getEnumConstants()) {
                            if (data[1].equals(o.toString())) {
                                if (o instanceof TegramMenu) {
                                   return (TegramMenu)o;
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException e) {
                }
            }
        }
        return null;
    }

    private synchronized void send(SendMessage msg){
        try {
            sendApiMethod(msg);
        } catch (TelegramApiException e) {
            LOG.error("Exception: {}", e);
        }
    }
//    public synchronized void sendCReply(String chatId,Integer messageId,String s) {
//
//    if (s!=null && "/menu".equals(s.trim())){
//            Menu.send(this, chatId);
//        }else{
//            //sendMessage.setReplyToMessageId(messageId);
//            //sendMessage.setText("И шо ви хотели этим сказать?");
//        }
//    }

//    public synchronized void sendMsg(String chatId,String s) {
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.enableMarkdown(true);
//        sendMessage.setChatId(chatId);
//        sendMessage.setText(s);
//        sendApiMethod1(sendMessage);
//    }

    public synchronized void sendAnsw(String chatId,String queryId,String s) {
        AnswerCallbackQuery sendMessage= new AnswerCallbackQuery();
        sendMessage.setCallbackQueryId(queryId);
        //SendMessage sendMessage = new SendMessage();

        //sendMessage.enableMarkdown(true);
        //sendMessage.setChatId(chatId);
        sendMessage.setShowAlert(false);
        sendMessage.setText(s);
        sendApiMethod1(sendMessage);
    }

    public final <T extends Serializable, Method extends BotApiMethod<T>> T sendApiMethod1(Method method){
        try {
            return sendApiMethod(method);
        } catch (TelegramApiException e) {
            LOG.error("Ошибка при отправке",e);
        }
        return null;
    }

    /**
     * Метод возвращает имя бота, указанное при регистрации.
     * @return имя бота*/
    @Override
    public String getBotUsername() {

        return "fanctioncoin1_bot";
    }

    /**
     * Метод возвращает token бота для связи с сервером Telegram
     * @return token для бота
     */
    @Override
    public String getBotToken() {
        return "1815275762:AAEMt7c49D5e5VgLWcDlQ34XZB_CCbsR2Rg";} // я подставил токен
    }



