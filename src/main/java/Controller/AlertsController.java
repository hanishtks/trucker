package Controller;

import Entity.Alerts;
import Service.AlertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class AlertsController {
    @Autowired
    AlertsService alertsService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Alerts> findHighAlerts() {

        return alertsService.findHighAlerts();
    }
   /* @RequestMapping(method = RequestMethod.GET, value = "/sortedByVin")
    public List<Alerts> sortHighAlerts(String vehicleID) throws ParseException{
        return alertsService.findHighSorted();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/{vin}")
    public List<Alerts> findVehicle(@PathVariable("vin") String vehicleID){
        return alertsService.findVehicleAlerts(vehicleID);


    */
}
