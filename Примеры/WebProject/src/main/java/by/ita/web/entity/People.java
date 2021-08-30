package by.ita.web.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long name;
    private Timestamp birthday;
    @OneToMany( orphanRemoval = true,mappedBy = "people")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(id, people.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
