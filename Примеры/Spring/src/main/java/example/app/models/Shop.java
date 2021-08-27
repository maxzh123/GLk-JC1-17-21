package example.app.models;

import javax.persistence.*;

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

}
