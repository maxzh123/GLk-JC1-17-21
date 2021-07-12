package WorkBookTask.Task_43_45_Throwable.Task_44_SimplesException;

import java.util.regex.Pattern;

public class Mail {
    private String post;

    public String getPost() {
        return post;
    }

    public void setPost(String post) throws MailException {
        if (!post.matches("[a-zA-Z0-9\\-\\.\\_]+@([a-z0-9\\_\\-]+\\.)+[a-z]{2,5}")){
            throw new MailException("Вы ввели не коректно почту"); // если наша почта не соотвествует регулярке значит кинем ошибку
        }
        this.post = post;
    }
}
