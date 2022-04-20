package at.ran.OO.CarsNew;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(5, Engine.TYPE.Diesel);
        Producer p1 = new Producer("BMW","Germany",0.4);
        Car c1 = new Car("black",280,110000, 8, e1,p1,30000 );

        c1.price();
        c1.fueConsumption();

        Truck t1 = new Truck("green", 120,100000,8,e1,p1,20000,"trailer1");

        System.out.println(t1.getColor() + t1.getTrailer());
        t1.drive();
        t1.stop();

    }
}
