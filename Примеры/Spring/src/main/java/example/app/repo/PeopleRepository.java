package example.app.repo;

import example.app.models.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository  extends CrudRepository<People, Long> {
}
