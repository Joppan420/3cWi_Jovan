package at.ran.basics;

import java.util.Random;

public class Wuerfelspiel {
    public static void main(String[] args) {

        boolean isFinished = false;
        int total = 0;



        Random random = new Random();

        while (!isFinished) {
            printMenu();
            int selection = random.nextInt();
            System.out.println(selection);

            int a = 0;
            int b = 0;


            if (selection == 1) {
                System.out.println("Du hast eine" + a + "gewürfelt." + "Dein Gegner hat eine" + b + "gewürfelt = Gleichstand");
                Random random1 = new Random();
                double selection1 = random.nextDouble();
                System.out.println(selection1);
                total += selection1;
            } else if (selection == 2) {
                System.out.println("Du hast eine" + a + "gewürfelt." + "Dein Gegner hat eine" + b + "gewürfelt = Dein Gegner gewinnt");
                Random random2 = new Random();
                double selection2 = random.nextDouble();
                System.out.println(selection2);
                total -= selection2;
            } else {
            }

        }
    }

    public static void printMenu(){
        System.out.println(" 1. Spiel starten");
        System.out.println(" 2. Abbrechen");
    }
}

