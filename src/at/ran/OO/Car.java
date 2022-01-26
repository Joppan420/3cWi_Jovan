package at.ran.OO;

public class Car {

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;

    //Methode
    public void drive(){
        this.fuelAmount =this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

}
