package at.ran.schoolcheck.Test2;


public class CoffeeMachine {

    private String brand;
    private String color;
    private int state;

    public CoffeeMachine(String brand, String color, int state) {
        this.brand = brand;
        this.color = color;
        this.state = state;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}

