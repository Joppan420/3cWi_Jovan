package at.ran.OO.CarsNew;

public class Producer {

    private String name;
    private String countryOfOrigin;
    private double rabatt;

    public Producer(String name, String countryOfOrigin, double rabatt) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.rabatt = rabatt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public double getRabatt() {
        return rabatt;
    }

    public void setRabatt(double rabatt) {
        this.rabatt = rabatt;
    }
}
