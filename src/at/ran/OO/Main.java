package at.ran.OO;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(8,70, "BMW", "B30", "black");
        Car c2 = new Car(6, 20, "Mercedes", "M4881", "white");


        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90, -40);

        Tyres t1 = new Tyres(4,47);

        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addTyres(t1);

        System.out.println(c1.getTyres().get(0).getTyreProfile());

    }

}
