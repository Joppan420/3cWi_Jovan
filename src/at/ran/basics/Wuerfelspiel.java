package at.ran.basics;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {

        boolean isFinished = false;

        while (!isFinished) {

            int a = 0;
            int b = 0;

            System.out.println("--- 1 Spiel starten ---");
            System.out.println("--- 2 Abbrechen ---");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                Random random = new Random();
                for (int i = 0; i < 1; i++) {
                    int randomNumberA = 1 + random.nextInt(6);
                    int randomNumberB = 1 + random.nextInt(6);
                    a += randomNumberA;
                    b += randomNumberB;
                }
            }
            if (a > b) {
                System.out.println("Du hast leider verloren. Der score vom Computer war " + a + ", und dein score war" + b);
            } else if (a < b) {
                System.out.println("Toll du hast gewonnen. Der score vom Computer war " + a + ", und dein score war" + b);
            } else {
                System.out.println("--- Wird geschlossen ---");
                isFinished = true;
            }
        }
    }
}

