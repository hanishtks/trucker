package Service;

import Entity.alertInfo;
import Entity.vehicleInfo;
import Entity.vehicleTirePressure;
import Entity.vehicleUpdate;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    vehicleInfo update(vehicleInfo vehicle);
    List<vehicleInfo> findAll();
    vehicleInfo findById(String ID);
    vehicleUpdate create(vehicleUpdate vehicle);
    vehicleTirePressure create(vehicleTirePressure pressure);
    List<alertInfo> findHighAlerts();
    List<vehicleUpdate> findGeoLocation(String vin);
    List<alertInfo> findVehicleAlerts(String vin);

    void throwAlerts(vehicleUpdate vehicle);
}