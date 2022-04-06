package at.ran.OO.CarsNew;

public class Car {

    private String color;
    private int fullSpeed;
    private int basePrice;
    private double basicConsumption;
    private Engine engine;
    private Producer producer;

    public Car(String color, int fullSpeed, int basePrice, double basicConsumption, Engine engine, Producer producer) {
        this.color = color;
        this.fullSpeed = fullSpeed;
        this.basePrice = basePrice;
        this.basicConsumption = basicConsumption;
        this.engine = engine;
        this.producer = producer;
    }

    public void price() {
        double rabatt = this.producer.getRabatt();
        double price = basePrice - (basePrice * rabatt);
        System.out.println("Preis mit Rabatt = " + price);
        System.out.println("Preis ohen Rabatt = " + basePrice);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFullSpeed() {
        return fullSpeed;
    }

    public void setFullSpeed(int fullSpeed) {
        this.fullSpeed = fullSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasicConsumption() {
        return basicConsumption;
    }

    public void setBasicConsumption(double basicConsumption) {
        this.basicConsumption = basicConsumption;
    }

}
