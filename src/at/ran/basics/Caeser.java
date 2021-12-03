package at.ran.basics;

import java.util.Scanner;

public class Caeser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ein Text ein");
        String word = scanner.nextLine();
        int encrypt = scanner.nextInt();

        if (encrypt >= 1 && encrypt <= 10) {
            char[] neww = word.toCharArray();
            char[] secret = encryptword(encrypt, neww);

            System.out.println("Verschlüsselte Wort");

            for (int i = 0; i < secret.length; i++) {
                System.out.println(secret[i]);
            }
        }

    }
}
