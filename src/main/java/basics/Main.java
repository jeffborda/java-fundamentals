package basics;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Pluralize Tests
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


        // Flipping Coins
        System.out.println(flipNHeads(3));

        System.out.println(flipNHeads(1));


        // Clock
        clock();
    }

    public static String pluralize(String inputWord, int inputNumber) {

        if(inputNumber == 0 || inputNumber > 1) {
            return inputWord + "s";
        }
        return inputWord;
    }

    public static String flipNHeads(int n) {

        int headsCount = 0;
        int flipCount = 0;
        boolean previousHeads = true;

        do {
            double randomNumber = Math.round(Math.random() * 10.0) / 10.0; //Rounds to one decimal ie: 0.7

            System.out.println(randomNumber);

            if((randomNumber >= 0.5 && previousHeads) || (randomNumber >= 0.5 && headsCount == 0)) {
                headsCount++;
                previousHeads = true;
                System.out.println("heads");
            }
            else {
                previousHeads = false;
                headsCount = 0;
                System.out.println("tails");
            }

            flipCount++;
        } while(headsCount < n);

        return "It took " + flipCount + " flips to flip " + n + " heads in a row.";
    }

    public static void clock() {

        LocalDateTime now = LocalDateTime.now();
        int nowSecond1 = now.getSecond();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(formatter);

        //To prevent multiple prints if app starts at sec :00
        if(nowSecond1 != 0) {
            System.out.println(formattedTime);
        }

        //Switch to prevent multiple :00 sec prints
        boolean printedZeroSecond = false;

        while(true) {

            int nowSecond2 = LocalDateTime.now().getSecond();

            if(nowSecond2 > nowSecond1 || nowSecond2 == 0) {

                if(nowSecond2 == 0 && !printedZeroSecond) {
                    now = LocalDateTime.now();
                    formattedTime = now.format(formatter);
                    System.out.println(formattedTime);
                    nowSecond1 = nowSecond2;
                    printedZeroSecond = true;
                }
                else if(nowSecond2 != 0) {
                    now = LocalDateTime.now();
                    formattedTime = now.format(formatter);
                    System.out.println(formattedTime);
                    nowSecond1 = nowSecond2;
                    printedZeroSecond = false;
                }
            }
        }
    }

}
