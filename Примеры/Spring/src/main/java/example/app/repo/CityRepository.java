package example.app.repo;

import example.app.models.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository  extends CrudRepository<City, Long> {
}
