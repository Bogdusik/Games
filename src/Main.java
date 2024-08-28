//import java.util.Scanner;
//import java.util.Random;

public class Main {
    public static void main(String[] args) {
//     //In this game, the computer will generate a random number between 1 and 100, and the player has to guess the number.
//        Scanner scanner = new Scanner(System.in);
//        int lowerBound = 1;
//        int upperBound = 100;
//        int randomeNumber = (int)(Math.random() * (upperBound - lowerBound + 1) + lowerBound);
//        int numberOfTries = 0;
//        boolean hasGuessedCorrectly = false;
//
//        System.out.println("Welcome to the Guessing Game!!!");
//        System.out.println("The computer is selected 1 specific number from 1 to 100, can u guess it?");
//
//        while(!hasGuessedCorrectly){
//            System.out.println("Enter your guess: ");
//            int userGuess = scanner.nextInt();
//            numberOfTries++;
//
//            if(userGuess < lowerBound || userGuess > upperBound){
//                System.out.println("Please enter a number between 1 to 100: ");
//            } else if (userGuess < randomeNumber) {
//                System.out.println("Too low. Please try again !)");
//            } else if (userGuess > randomeNumber) {
//                System.out.println("Too high. Please try again !)");
//            } else{
//                hasGuessedCorrectly = true;
//                System.out.println("Congratulations!!!! You are soo smart :))) and you guessing " + numberOfTries + "tries");
//            }
//        }
//        scanner.close();

        //Game: "Rock, Paper, Scissors"
        //In this game, the player chooses either rock, paper, or scissors, and the computer also makes a random choice.
        // The program then determines the winner based on the game rules.

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.println("Welcome to Rock, Paper, Scissors ");
//        System.out.println("Please select your answer:");
//
//        String[] choices = {"Rock", "Paper", "Scissors"};
//        String userChoice = scanner.next().toLowerCase();
//
//        if(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")){
//            int computerIndex = random.nextInt(3);
//            String computerChoice = choices[computerIndex];
//            System.out.println("Computer choice is: " + computerChoice);
//             if(userChoice.equals(computerChoice)){
//                 System.out.println("It's a tie!");
//             } else if ((userChoice.equals("rock") && computerChoice.equals("paper")) ||
//                     (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
//                             (userChoice.equals("paper") && computerChoice.equals("rock"))) {
//                                System.out.println("Congratulations You are win!!!");
//             } else{
//                System.out.println("Computer win You!");
//            }
//        } else {
//            System.out.println("Invalid choice, please try again!");
//        }
//        scanner.close();

        // New game Hangman, In this game, the computer randomly selects a word
        // and the player has to guess it by suggesting letters within a certain number of attempts.
        // The player wins if they guess the word before the person is fully drawn.

//        Scanner scanner = new Scanner(System.in);
//        String[] words = {"hangman", "java", "programming", "computer", "science", "developer", "language"};
//        String word = words[(int) (Math.random() * words.length)];
//        char[] guessedLetters = new char[word.length()];
//        int attempts = 7;
//        boolean wordGuessed = false;
//
//        System.out.println("Welcome to Hangman!");
//
//        while (attempts > 0 && !wordGuessed) {
//            System.out.println(displayWord(word, guessedLetters));
//            System.out.print("Enter a letter: ");
//            char guess = scanner.next().toLowerCase().charAt(0);
//
//            if (contains(guessedLetters, guess)) {
//                System.out.println("You already guessed this letter.");
//            } else {
//                boolean correctGuess = false;
//                for (int i = 0; i < word.length(); i++) {
//                    if (word.charAt(i) == guess) {
//                        guessedLetters[i] = guess;
//                        correctGuess = true;
//                    }
//                }
//
//                if (!correctGuess) {
//                    System.out.println("Incorrect guess. You have " + --attempts + " attempts left.");
//                }
//            }
//
//            if (isWordGuessed(guessedLetters)) {
//                wordGuessed = true;
//                System.out.println("Congratulations! You guessed the word: " + word);
//            }
//        }
//
//        if (!wordGuessed) {
//            System.out.println("Sorry, you ran out of attempts. The word was: " + word);
//        }
//
//        scanner.close();
//    }
//
//    public static String displayWord(String word, char[] guessedLetters) {
//        StringBuilder display = new StringBuilder();
//        for (char letter : word.toCharArray()) {
//            if (contains(guessedLetters, letter)) {
//                display.ap pend(letter);
//            } else {
//                display.append("_");
//            }
//            display.append(" ");
//        }
//        return display.toString();
//    }
//
//    public static boolean contains(char[] guessedLetters, char guess) {
//        for (char letter : guessedLetters) {
//            if (letter == guess) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean isWordGuessed(char[] guessedLetters) {
//        for (char letter : guessedLetters) {
//            if (letter == 0) {
//                return false;
//            }
//        }
//        return true;
    }
}