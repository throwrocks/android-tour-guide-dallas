package rocks.athrow.android_tour_guide;

/**
 * Attraction
 * Created by thr0w on 7/10/16.
 */
public class Attraction {
    private String name;
    private String address;
    private String schedule;

    public Attraction(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
