package at.ran.schoolcheck.Test;

public class Lightelement {

    private int usage;
    private String name;
    private Boolean status;
    private String color;

    public Lightelement(int usage, String name, Boolean status, String color) {
        this.usage = usage;
        this.name = name;
        this.status = status;
        this.color = color;
    }

    public void turnOn(){
        if(status == true) {
            System.out.println("Mein Name ist " + Name() + "Ich bin bereits eingeschaltet.");
        }else{
            newUsage(Usage() + 5);
            newStatus(true);
        }
    }

    public void turnOff(){
        if(status == false) {
            System.out.println("Mein Name ist " + Name() + "Ich bin ausgeschaltet.");
        }else{
            newStatus(false);
        }
    }

    public String Name() {
        return name;
    }

    public int Usage() {
        return usage;
    }

    public void newUsage(int usage) {
        this.usage = usage;
    }

    public void newStatus(boolean status) {
        this.status = status;
    }

}
