package example.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long name;
    private Timestamp birthday;
    @OneToMany( orphanRemoval = true,mappedBy = "people")
    @Lazy
    @Transient
    private Set<Receipt> receipts;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id=id;
    }
    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public Set<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(Set<Receipt> receipts) {
        this.receipts = receipts;
    }
}
