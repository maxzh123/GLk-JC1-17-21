package i18n.examples;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class DemoResourceBundle {
    public String getMessage(String key, Locale loc){
        ResourceBundle rb = ResourceBundle.getBundle("labels", loc);
        return  rb.getString(key);
    }
    public String getNumberInstance(Locale loc,int num){
        NumberFormat format = NumberFormat.getNumberInstance(loc);
        return format.format(num);
    }
    public String getCurrencyInstance(Locale loc,int num){
        NumberFormat format = NumberFormat.getCurrencyInstance(loc);
        return format.format(num);

    }
    public String getPercentInstance(Locale loc,int num){
        NumberFormat format = NumberFormat.getPercentInstance(loc);
        return format.format(num);
    }
    public String getNow(Locale loc){
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
        return df.format(new Date());
    }
    public String getNow2(Locale loc){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss.SSS", loc);
        return formatter.format(LocalDateTime.now());
    }



}
