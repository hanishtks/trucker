package Repository;


import Entity.vehicleInfo;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<vehicleInfo, String> {

}
