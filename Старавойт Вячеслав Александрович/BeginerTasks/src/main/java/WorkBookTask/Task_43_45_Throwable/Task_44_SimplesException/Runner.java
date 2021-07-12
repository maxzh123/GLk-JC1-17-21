package WorkBookTask.Task_43_45_Throwable.Task_44_SimplesException;

import java.util.Scanner;

public class Runner {

final static Scanner scannerMail =new Scanner(System.in);

    public static void main(String[] args) {
        Mail mail =new Mail();
        try {
            String post =scannerMail.nextLine();
            mail.setPost(post);
            System.out.println("Ваша введенная почта верна а значит регистрация успешна: " + mail.getPost());
        } catch (MailException e) {
            System.err.println(e.getMessage()); // Выбросим сообщение об ошибке
           // e.printStackTrace();
        }
        }
    }

