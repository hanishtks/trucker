package Service;

import Entity.Alerts;
import Repository.AlertsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.List;

public class AlertsServiceImpl implements AlertsService {
     @Autowired
    AlertsRepository alertsRepository;
    public List<Alerts> findHighAlerts() {


        return alertsRepository.findHighAlerts();
    }
}

    /*public List<Alerts> findHighSorted() throws ParseException {
        List<Alerts> intialList = alertsRepository.findHighSorted();
    }

    public List<Alerts> findVehicleAlerts(String vehicleID) {
        return null;
    }
}

     */




