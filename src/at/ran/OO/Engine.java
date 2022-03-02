package at.ran.OO;

public class Engine {
    public enum TYPE{DIESEL, Gas}
    private int horsePower;
    private TYPE type; //Diesel oder Benzin
    private int speed;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }


    public void drive(int amount){
        System.out.println("The motor is running with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
