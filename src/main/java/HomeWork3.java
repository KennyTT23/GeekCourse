import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) throws IOException {
        compareNums();
        guessTheWord();

    }

    public static void compareNums() {
       // change maxNum to give the boundary of random...
        int minNum = 0;
        int maxNum = 1000;
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        do {
        int randNum = random.nextInt(maxNum);
            System.out.println(randNum);
            System.out.println();
            System.out.println("Let's play the game 'Guess the number'");
            System.out.println("You have 3 chances");
            System.out.println("Guess the number from " + minNum + " to " + maxNum + ".");

            for (int i = 0; i < 3; i++) {
                int scanned = scanner.nextInt();
                if (randNum == scanned) {
                    System.out.println("Congratulations. You won! Hooraaay!");
                    System.out.println("Do you wanna try again: Yes or No?");
                    break;
                } else if (randNum < scanned && i < 2) {
                    System.out.println("Your number is too big, try again!" + " Chances left: " + (3 - (i + 1)));

                } else {
                    System.out.println("Your number is too small, try again!" + " Chances left: " + (3 - (i + 1)));
                    if (i == 2) {
                        System.out.println("You have lost." + " Do you wanna try again? Yes(1) or No(0).");
                    }
                }
            }
        } while (scanner.nextInt() == 1);

    }

    static void guessTheWord() throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        String guessWord = words[new Random().nextInt(words.length)];
        Scanner scanner = new Scanner(System.in);
        String word;
        int counter = 0;
        do {
            System.out.println("Guess the word: ");
            word = scanner.nextLine();
            if (!word.equals(guessWord)) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < guessWord.length(); i++) {
                    if (guessWord.charAt(i) == word.charAt(i)) {
                        builder.append(guessWord.charAt(i));
                    } else {
                        String mask = "###############";
                        builder.append(mask);
                        System.out.println("You guess only this characters:");
                        System.out.println(builder.toString());
                        break;
                    }
                }
            }
            counter ++;
        } while (!word.equals(guessWord));
        System.out.println("Congrats you guess! Your score is " + counter + " and word is: " + guessWord);
    }
}

