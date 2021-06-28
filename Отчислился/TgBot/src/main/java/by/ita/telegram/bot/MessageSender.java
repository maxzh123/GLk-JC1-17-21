package by.ita.telegram.bot;

import org.telegram.telegrambots.api.objects.Message;

public interface MessageSender {
    void sendReply(Message m, String s);
    void sendMessage(long chatId,String s);
    void sendMenu(long chatId,Class<? extends TegramMenu> menu);

}
