package hello;
import org.springframework.data.repository.CrudRepository;
import hello.model.Producer;

public interface ProducerRepository extends CrudRepository<Producer, Long> {
}