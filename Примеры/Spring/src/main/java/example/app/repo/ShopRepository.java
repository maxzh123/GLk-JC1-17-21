package example.app.repo;

import example.app.models.Shop;
import org.springframework.data.repository.CrudRepository;

public interface ShopRepository  extends CrudRepository<Shop, Long> {
}
