package hello;

import hello.model.Farmacy;
import org.springframework.data.repository.CrudRepository;

public interface FarmacyRepository extends CrudRepository<Farmacy, Integer> {
}