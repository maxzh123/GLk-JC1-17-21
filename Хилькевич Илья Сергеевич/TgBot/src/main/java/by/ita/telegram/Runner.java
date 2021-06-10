package by.ita.telegram;

import by.ita.telegram.bot.SimpleBot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class Runner {

    private static final Logger LOGGER;
    private static final SimpleBot bot;

    static{
        LOGGER = LoggerFactory.getLogger(Runner.class);
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        bot=new SimpleBot();
        try {
            telegramBotsApi.registerBot(bot);
        } catch (TelegramApiRequestException e) {
            LOGGER.error("Error",e);
        }

    }


    public static void main(String[] args) {
            LOGGER.info("bot startup");
    }

}
