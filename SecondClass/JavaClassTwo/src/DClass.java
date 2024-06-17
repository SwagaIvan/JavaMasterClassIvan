public class DClass {

    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It's not an Alien!");
            System.out.println("And Am scared of Alien");
        }
int topScores = 80;
        if (topScores < 100) {
            System.out.println("You have got the highest score");
        }

        int secondTopScore = 60;
        if ( (topScores > secondTopScore) && (topScores < 100)) {
            System.out.println("Greater than secondTopScore but less than 100");
        }

        if ((topScores > 80)|| (secondTopScore <= 80)) {
            System.out.println("Either or both of the conditions is true");

        }
    }
}