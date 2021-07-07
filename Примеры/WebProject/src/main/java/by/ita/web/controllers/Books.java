package by.ita.web.controllers;

import by.ita.web.entity.Book;
import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.rapidoid.annotation.PUT;

import java.util.ArrayList;
import java.util.List;

@Controller("books")
public class Books {

    @GET("/")
    public List<Book> list() {
        List<Book> result=new ArrayList<>();
        Book b=new Book();
        for (long i=1;i<1000;i++){
            b.setId(i);
            b.setAuthor("Author "+i);
            b.setTitle("Title "+i);
            result.add(b);
        }
        return result;
    }
    @GET("/{id}")
    public Book get(long id) {
        Book b = new Book();
            b.setId(id);
            b.setAuthor("Author " + id);
            b.setTitle("Title " + id);
            return b;
    }

    @PUT("/")
    public Book put(Book b) {
        return b;
    }


}

