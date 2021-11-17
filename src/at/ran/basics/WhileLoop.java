package at.ran.basics;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;

        int total = 0;


        while (!isFinished) {
            int randomValue = 10 + random.nextInt(21);
            System.out.println("Nr:" + randomValue);

            total += randomValue;

            if (randomValue == 15) {
                isFinished = true;
            } else if (randomValue == 25){
                isFinished = true;
            } else{}

        }
        System.out.println("Finished");

        System.out.println("the total was " + total);
    }
}
