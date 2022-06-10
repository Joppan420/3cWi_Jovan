package at.ran.schoolcheck.Test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isFinished = false;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        CoffeeMachine cm1 = new CoffeeMachine("epson", "white", 98);
        WaterTank wt1 = new WaterTank(70, 100);
        Steering s1 = new Steering(10, 3);


        while (!isFinished) {
            printMenu();
            int selection = scanner.nextInt();
            System.out.println(selection);

            if (selection == 1) {4
                Scanner scanner1 = new Scanner(System.in);
                double selection1 = scanner.nextDouble();
                System.out.println(selection1);
                total += selection1;
                System.out.println("Sie haben " + selection1 + " Kaffee gewählt.");
            } else if (selection == 2) {
                Scanner scanner2 = new Scanner(System.in);
                double selection2 = scanner.nextDouble();
                if (selection2 < 40 && selection2 > 100)
                System.out.println(selection2);
                System.out.println("Die größe ihres Kaffees ist " + selection2);
                total += selection2;
            } else if (selection == 3) {
                Scanner scanner3 = new Scanner(System.in);
                double selection3 = scanner.nextDouble();
                if (selection3 < 1 && selection3 > 10)
                    System.out.println(selection3);
                System.out.println("Die Stärke ihres Kaffees ist " + selection3);
                total += selection3;
            } else if (selection == 5) {
                isFinished = true;
                System.out.println("Maschine is stopping!");
            } else {
            }


        }


    }

    private static void printMenu() {
        System.out.println(" 1. Kaffee");
        System.out.println(" 2. Größe");
        System.out.println(" 3. Stärke");
        System.out.println(" 4. Fertig");


    }
}
