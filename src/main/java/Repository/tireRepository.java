package Repository;


import Entity.vehicleId;
import Entity.vehicleTirePressure;
import org.springframework.data.repository.CrudRepository;

public interface tireRepository extends CrudRepository<vehicleTirePressure, vehicleId> {
}