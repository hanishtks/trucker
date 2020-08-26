package Entity;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Alerts.findHigh", query = "SELECT alerts FROM Alerts alerts WHERE alerts.priority = 'HIGH'")
})
public class Alerts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "VARCHAR(36)")
    private String rule ;
    @Column(columnDefinition = "VARCHAR(36)")
    private String priority;
    @Column(columnDefinition = "VARCHAR(36)")
    private String timestamp;

    private Vehicle vehicle;

    public Alerts(){

    }

    public Alerts(int id, String rule, String priority, String timestamp) {
        this.id = id;
        this.rule = rule;
        this.priority = priority;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public String toString(){
        return "Alerts{" + "id=" + id +
                ", rule='" + rule + '\''+
                ", priority='" + priority + '\''+
                ", timestamp='" + timestamp + '\'' +
                ", vehicle=" + vehicle +

        '}';

    }
}
