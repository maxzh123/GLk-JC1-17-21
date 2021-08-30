package example.app.repo;

import example.app.models.Market;
import org.springframework.data.repository.CrudRepository;

public interface MarketRepository extends CrudRepository<Market, Long> {
}
