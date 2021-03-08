import java.util.Date;

public class Person {
    private String name;
    private String last_name;
    private Country toCountry;
    private Country myCountry;
    private Date data;
    private Location location;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.setLast_name(name.substring(0));
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Country getToCountry() {
        return toCountry;
    }

    public void setToCountry(Country toCountry) {
        this.toCountry = toCountry;
    }

    public Country getMyCountry() {
        return myCountry;
    }

    public void setMyCountry(Country myCountry) {
        this.myCountry = myCountry;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
