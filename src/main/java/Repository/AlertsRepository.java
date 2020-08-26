package Repository;

import Entity.Alerts;

import java.util.List;

public interface AlertsRepository {
    public List<Alerts> findHighAlerts();

}

