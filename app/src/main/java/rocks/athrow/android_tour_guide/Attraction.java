package rocks.athrow.android_tour_guide;

/**
 * Attraction
 * Created by thr0w on 7/10/16.
 */
public class Attraction {

    private String category;
    private String name;
    private String address;
    private String description;
    private String schedule;
    private String filename;

    public Attraction(String category) {
        this.category = category;
        this.name = null;
        this.address = null;
        this.description = null;
        this.schedule = null;
        this.filename = null;
    }

    public String getCategory() {
        return category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }


}
