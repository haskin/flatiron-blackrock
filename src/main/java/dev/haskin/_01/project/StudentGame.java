package dev.haskin._01.project;

import java.util.Random;

public class StudentGame {
    private static String DIFFICULTY_PROMPT = "Please choose a difficulty: EASY, MEDIUM, or HARD. Type INFO for difficulty information.";
    private static String[] INFORMATION = {
            "Easy: guess a number - program will tell you if it was higher or equal (you win) or lower (computer wins) than the program's number.",
            "Medium: guess a number - program will tell you if it was strictly higher (you win) or lower or equal (computer wins) than the program's number.",
            "Hard: guess a number - program will tell you if it was equal (you win) or not (you lose) to the program's number." };

    enum Difficulty {
        EASY("easy"),
        MEDIUM("medium"),
        HARD("hard");

        Difficulty(String value) {
            this.value = value;
        }

        public final String value;
        public final String information

        public static final String parseDifficulty(String difficulty) {
            return difficulty.trim().toLowerCase();
        }
    }

    public static void main(String[] args) {
        int exclusiveUpperBound = 11;
        System.out.println(getRandomNumber());
    }

    private static getUserDifficulty() {

    }

    /**
     * Get random number between 0 (inclusive) and exclusiveUpperBound
     * 
     * @param exclusiveUpperBound
     * @return
     */
    private static int getRandomNumber(int exclusiveUpperBound) {
        Random random = new Random();
        return random.nextInt(exclusiveUpperBound);
    }
}

class AsciiArt {
    public static final String GAME_TITLE = "START GAME";
}
