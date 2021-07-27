package JavaRush.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.stream.Stream;

public class RunnerAccount {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Sara","a@tut.by"),
                new Account("Mila", "mila@mail.ry"),
                new Account("Neo", "neo@yandex.ry"));
        Stream<String> emails=getEmails(accounts);
        emails.forEach(System.out::println);
        Stream<String> emailsToUpperCase=getEmailsToUpperCase(accounts);
        emailsToUpperCase.forEach(System.out::println);

    }
    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        Stream<String>emails=accounts.stream().map((x)-> x.getEmail());
        return emails;
    }

    public static Stream<String> getEmailsToUpperCase(ArrayList<Account> accounts) {
        Stream<String>emails=accounts.stream().map((x)->x.getEmail().toUpperCase(Locale.ROOT));
        return emails;
    }
}
