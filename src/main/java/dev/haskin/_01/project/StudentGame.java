package dev.haskin._01.project;

import java.util.Random;

public class StudentGame {
    enum Difficulty {
        EASY("easy"),
        MEDIUM("medium"),
        HARD("hard");

        Difficulty(String value) {
            this.value = value;
        }

        public final String value;

        public static final String parseDifficulty(String difficulty) {
            return difficulty.trim().toLowerCase();
        }
    }

    public static void main(String[] args) {
        int exclusiveUpperBound = 11;
        System.out.println(getRandomNumber());
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
