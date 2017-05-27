package hello.repository;
import org.springframework.data.repository.CrudRepository;
import hello.model.FarmacyMedicine;

public interface FarmacyMedicineRepository extends CrudRepository<FarmacyMedicine, Long> {
}