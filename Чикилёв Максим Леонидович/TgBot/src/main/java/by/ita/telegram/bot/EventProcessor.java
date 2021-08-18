package by.ita.telegram.bot;

import by.ita.telegram.menu.TestMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.objects.CallbackQuery;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.inlinequery.ChosenInlineQuery;
import org.telegram.telegrambots.api.objects.inlinequery.InlineQuery;

public class EventProcessor {
    private final static Logger LOG= LoggerFactory.getLogger(EventProcessor.class);
    private final static long CHAT_ID=-1001288885463L;
    private final MessageSender sender;

    public EventProcessor(MessageSender sender) {
        this.sender=sender;
    }

    public void onUserMessage(Message m){
        if (CHAT_ID!=m.getChatId()){
            if ("/menu".equals(m.getText())){
                sender.sendMenu(m.getChatId(),TestMenu.class);
            }else{
                sender.sendReply(m, "Привет! поиграем?");
            }
        }

    }
    public void onGroupMessage(Message m){
        if (CHAT_ID!=m.getChatId()){
            sender.sendMessage(m.getChatId(),"Сам такой!");
        }
    }
    public void onChannelMessage(Message m){
        if (CHAT_ID!=m.getChatId()){
            sender.sendMessage(m.getChatId(),"Сам такой!");
        }
    }
    public void onChannelPost(Message m){
//        sender.sendMessage(m.getChatId(),"Сам такой!");
    }
    public void onCallbackQuery(CallbackQuery q,TegramMenu menuItem){
        if (menuItem==null){
            sender.sendMessage(q.getMessage().getChatId(),"А не нашлось меню для: "+q.getData());
        }else{
            sender.sendMessage(q.getMessage().getChatId(),"Фсе пропало вы тыкнули в: "+menuItem.getLabel());
        }

    }
    public void onInlineQuery(InlineQuery q){
        LOG.info(q.getQuery());
    }
    public void onChosenInlineQuery(ChosenInlineQuery q){
        LOG.info(q.getQuery());

    }


}
