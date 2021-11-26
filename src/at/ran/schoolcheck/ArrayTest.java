package at.ran.schoolcheck;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        String[] array1 = {"Er", "Sie"};
        String[] array2 = {"geht", "läuft", "rennt", "fährt"};
        String[] array3 = {"nach Hause", "zur Schule", "ins Büro", "zur Party"};

        Scanner arrayNumber = new Scanner(System.in);
        Random random = new Random();
        int selection = arrayNumber.nextInt();

        for (int i = 0; i < selection ; i++) {
            int randomNumber1 = 1 + random.nextInt(2);
            int randomNumber2 = 1 + random.nextInt(4);
            int randomNumber3 = 1 + random.nextInt(4);

        }

    }
}
