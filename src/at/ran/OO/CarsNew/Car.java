package at.ran.OO.CarsNew;

public class Car {

    private String color;
    private int fullSpeed;
    private int basePrice;
    private double basicConsumption;
    private Engine engine;
    private Producer producer;
    private double drivenKilometers;

    public Car(String color, int fullSpeed, int basePrice, double basicConsumption, Engine engine, Producer producer, double drivenKilometers) {
        this.color = color;
        this.fullSpeed = fullSpeed;
        this.basePrice = basePrice;
        this.basicConsumption = basicConsumption;
        this.engine = engine;
        this.producer = producer;
        this.drivenKilometers = drivenKilometers;
    }

    public void price() {
        double rabatt = this.producer.getRabatt();
        double price = basePrice - (basePrice * rabatt);
        System.out.println("Preis mit Rabatt = " + price);
        System.out.println("Preis ohne Rabatt = " + basePrice);
    }

    public void fueConsumption(){
        if(drivenKilometers > 50000) {
            double consumtionPrecent = 1.098;
            setBasicConsumption((int) (basicConsumption * consumtionPrecent));

            double newFuelConsumption1 = getBasicConsumption();
            System.out.println(newFuelConsumption1);
        }else{
            double newFuelConsumption2 = getBasicConsumption();
            System.out.println(newFuelConsumption2);
        }
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

    public double getDrivenKilometers() {
        return drivenKilometers;
    }

    public void setDrivenKilometers(double drivenKilometers) {
        this.drivenKilometers = drivenKilometers;
    }
}
