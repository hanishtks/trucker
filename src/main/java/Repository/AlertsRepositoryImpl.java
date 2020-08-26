package Repository;

import Entity.Alerts;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AlertsRepositoryImpl  implements AlertsRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Alerts> findHighAlerts() {
        TypedQuery<Alerts> typedQuery = em.createNamedQuery("Alerts.findHigh", Alerts.class);
        List<Alerts> alertsList = typedQuery.getResultList();
        return alertsList;

        }

    }

