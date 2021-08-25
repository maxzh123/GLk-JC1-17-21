import i18n.examples.DemoResourceBundle;
import jul.example.Runner;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.NumberFormat;
import java.util.Locale;

public class I18nTest {
    final static Logger logger = LoggerFactory.getLogger(I18nTest.class);

    @ParameterizedTest(name = "{0} {1} I18N")
    @CsvSource({
            ",",
            "ru,",
            "ru,RU",
            "ru,BY",
            "en,",
            "en,US"
    })
    void firstTest(String loc,String lang) {
        Locale l=Locale.getDefault();
        if (loc!=null && lang!=null){
            l=new Locale(loc,lang);
        }else if (loc!=null && lang==null){
            l=new Locale(loc);
        }
        DemoResourceBundle b = new DemoResourceBundle();
        logger.info("Проверяем для {}:\t {}:\t{}->{} {} {} {}",l,b.getMessage("message.welcome",l),
                b.getMessage("label.field",l),
                b.getMessage("label.button",l),
                b.getNumberInstance(l,100),
                b.getCurrencyInstance(l,200),
                b.getPercentInstance(l,146)
                );
        logger.info("Старый АПИ Дат {}:\t {}",l,b.getNow(l));
        logger.info("Новый АПИ Дат {}:\t {}",l,b.getNow2(l));

    }


}
