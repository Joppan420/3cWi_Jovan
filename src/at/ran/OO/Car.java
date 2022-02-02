package at.ran.OO;

public class Car {

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;
    public int drivenRoute;
    public int tankVolume;

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

}
