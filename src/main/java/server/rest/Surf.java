package server.rest;

/**
 * Created by aohana
 */
public class Surf {

    private String city;
    private String surfHeight;
    private String surfUnits;
    private String windSpeed;
    private String windUnit;

    public Surf(String city, String surfHeight, String surfUnits, String windSpeed, String windUnit) {
        this.city = city;
        this.surfHeight = surfHeight;
        this.surfUnits = surfUnits;
        this.windSpeed = windSpeed;
        this.windUnit = windUnit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSurfHeight() {
        return surfHeight;
    }

    public void setSurfHeight(String surfHeight) {
        this.surfHeight = surfHeight;
    }

    public String getSurfUnits() {
        return surfUnits;
    }

    public void setSurfUnits(String surfUnits) {
        this.surfUnits = surfUnits;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindUnit() {
        return windUnit;
    }

    public void setWindUnit(String windUnit) {
        this.windUnit = windUnit;
    }

}
