package at.ran.basics;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        boolean isFinished = false;
        int total = 0;



        Scanner scanner = new Scanner(System.in);

        while (!isFinished) {
            printMenu();
            int selection = scanner.nextInt();
            System.out.println(selection);


            if (selection == 1) {
                System.out.println("Geben sie den Betrag ein den Sie einzahlen möchten");
                Scanner scanner1 = new Scanner(System.in);
                double selection1 = scanner.nextDouble();
                System.out.println(selection1);
                total += selection1;
            } else if (selection == 2) {
                System.out.println("Wie viel würden Sie gerne abheben?");
                Scanner scanner2 = new Scanner(System.in);
                double selection2 = scanner.nextDouble();
                System.out.println(selection2);
                total -= selection2;
            } else if (selection == 3) {
                System.out.println("Der Kontostand beträgt: " + total);
            } else if (selection == 4) {
                isFinished = true;
                System.out.println("Maschine is stopping!");
            } else {
            }

        }
    }

    public static void printMenu(){
        System.out.println(" 1. Einzahlen");
        System.out.println(" 2. Abheben");
        System.out.println(" 3. Kontostand");
        System.out.println(" 4. Ende");
    }
}
