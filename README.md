# Java Games Collection

This repository contains several simple console-based games implemented in Java. The games featured include:

- **Guessing Game**: A game where the player guesses a randomly generated number between 1 and 100.
- **Rock, Paper, Scissors**: A classic game where the player selects rock, paper, or scissors, and the computer randomly chooses one to determine the winner.
- **Hangman**: A word-guessing game where the player guesses a word by suggesting letters, with a limited number of attempts.

## Games Overview

### 1. Guessing Game
- The computer generates a random number between 1 and 100.
- The player has to guess the number.
- After each guess, the program tells the player if the guess is too high, too low, or correct.
- The game continues until the player guesses correctly.

### 2. Rock, Paper, Scissors
- The player chooses either "rock", "paper", or "scissors".
- The computer randomly selects one of the options.
- The winner is determined based on the following rules:
  - Rock beats Scissors
  - Scissors beats Paper
  - Paper beats Rock
- If both players choose the same option, it’s a tie.

### 3. Hangman
- The computer randomly selects a word from a predefined list.
- The player guesses one letter at a time.
- The player has a limited number of incorrect guesses before losing the game (7 attempts).
- The player wins if they can guess the word before running out of attempts.

## Running the Games

### Prerequisites
Make sure you have the following installed on your system:
- Java 8 or higher.

### How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/java-games.git
   cd java-games
2. Compile the Java code:
   javac Main.java
3. Run the game:
   java Main

### Game Modes
You can uncomment the game code in the Main.java file to choose which game to play. By default, the code is set up for one game at a time.
- Guessing Game: Uncomment the Guessing Game section.
- Rock, Paper, Scissors: Uncomment the Rock, Paper, Scissors section.
- Hangman: Uncomment the Hangman section.

### Contribution
Feel free to fork the repository, make improvements, and create pull requests!

### License
This project is licensed under the MIT License.
