package example.app.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="shop_id", nullable=false)
    private Shop shop;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="people_id", nullable=false)
    private People people;

    private BigDecimal amount;
    @Column(name="processed_at")
    private Timestamp processedAt;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id=id;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(Timestamp processedAt) {
        this.processedAt = processedAt;
    }
}
