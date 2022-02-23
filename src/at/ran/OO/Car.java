package at.ran.OO;

public class Car {

    private Engine engine;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int drivenRoute;
    private int tankVolume;

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDrivenRoute() {
        return drivenRoute;
    }

    public void setDrivenRoute(int drivenRoute) {
        this.drivenRoute = drivenRoute;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public Car(int fuelConsumption, int fuelAmount, String brand,String serialNumber, String color){

        this.brand = brand;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.serialNumber = serialNumber;
    }

    //Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void dbreak(){
        if(this.drivenRoute > 10);
        System.out.println("I slow down");
    }

    public void turboBoost(){
        if(this.tankVolume * 0.1 < fuelAmount){
            System.out.println("SuperBoostMode");
        }else {
            System.out.println("Not enough fuel to go SuperBoost");
        }
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange(){
        System.out.println(this.tankVolume - this.fuelConsumption + " Liter you have to drive");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
