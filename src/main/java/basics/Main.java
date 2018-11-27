package basics;

public class Main {
    public static void main(String[] args) {

        // Pluralize Tests
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    }

    public static String pluralize(String inputWord, int inputNumber) {

        if(inputNumber == 0 || inputNumber > 1) {
            return inputWord + "s";
        }

        return inputWord;
    }

}
