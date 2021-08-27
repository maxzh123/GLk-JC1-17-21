package by.ita.web.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="city_id", nullable=false)
    private City city;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="market_id", nullable=false)
    private Market market;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(id, shop.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
