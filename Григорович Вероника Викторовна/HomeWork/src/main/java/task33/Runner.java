package task33;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        AbstractBankCard [] abstractBankCards=new AbstractBankCard[]{(new DebitCard("зарплатная карточка", 500)),
//                (new CreditCard("кредитная карточка",500,200)),
//        new InstallmentCard("карта рассрочки", 500, 200,12,400)};
//        for (int i = 0; i < abstractBankCards.length; i++) {
//            abstractBankCards[i].printInfo();
//        }
DebitCard debitCard=new DebitCard("Зарплатная карточка",700);
        System.out.println("Первоначальное значение cardBalance "+debitCard.cardBalance);
        Class<DebitCard> debitCardClass=DebitCard.class;
        Field[] declaredFields = debitCardClass.getDeclaredFields();
        for (Field field :declaredFields) {
            System.out.println("Поля класса "+field); //в общем, что выяснилось, поля класса родителя не показываются.
        }
        System.out.println("Родительский класс "+debitCardClass.getSuperclass());
        System.out.println("Методы класса "+ Arrays.toString(debitCardClass.getDeclaredMethods())); //статические классы тут тоже показывают
        System.out.println("Конструкторы класса"+Arrays.toString(debitCardClass.getConstructors()));
        Field newCardBalance=debitCardClass.getDeclaredField("cardBalance"); //получаем поле cardBalance
        newCardBalance.set(debitCard,100);
        System.out.println("Новое значение cardBalance "+debitCard.cardBalance);
        Method veryNeededMethod=debitCardClass.getDeclaredMethod("someClass"); //нашли наш метод
        veryNeededMethod.setAccessible(true); //этот метод приватный, не беда
        veryNeededMethod.invoke(debitCard);
    }
}
