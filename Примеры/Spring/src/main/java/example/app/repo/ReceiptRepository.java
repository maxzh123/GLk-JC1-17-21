package example.app.repo;

import example.app.models.Receipt;
import org.springframework.data.repository.CrudRepository;

public interface ReceiptRepository  extends CrudRepository<Receipt, Long> {
}
