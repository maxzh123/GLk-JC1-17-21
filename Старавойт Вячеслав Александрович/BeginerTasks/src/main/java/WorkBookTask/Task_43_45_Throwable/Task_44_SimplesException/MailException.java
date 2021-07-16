package WorkBookTask.Task_43_45_Throwable.Task_44_SimplesException;

public class MailException extends Exception{ // создал просто ошибку почты, а alt+insert добавил конструкторы по умолчанию которые есть у Exception

    public MailException() {
    }

    public MailException(String message) {
        super(message);
    }

    public MailException(String message, Throwable cause) {
        super(message, cause);
    }

    public MailException(Throwable cause) {
        super(cause);
    }

    public MailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
