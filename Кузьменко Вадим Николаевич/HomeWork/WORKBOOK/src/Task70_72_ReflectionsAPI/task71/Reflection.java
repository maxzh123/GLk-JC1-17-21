package Task70_72_ReflectionsAPI.task71;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Ref;

public class Reflection {
    public static void main(String[] args) {

    }
    Class<Main> mClassObject = Main.class;
    Method method;

    {
        try {
            method = mClassObject.getDeclaredMethod("print", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            method.invoke(Main.class, String.class);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
