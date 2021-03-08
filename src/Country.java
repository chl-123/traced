public class Country {
    private String countryName;
    private String quarantine_data;
    private Location[] location;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getQuarantine_data() {
        return quarantine_data;
    }

    public void setQuarantine_data(String quarantine_data) {
        this.quarantine_data = quarantine_data;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
}
