package example.app.models;

import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @OneToMany( orphanRemoval = true,mappedBy = "market")
    @Lazy
    @Transient
    private Set<Shop> shops;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id=id;
    }

    public Set<Shop> getShops() {
        return shops;
    }

    public void setShops(Set<Shop> shops) {
        this.shops = shops;
    }
}
