package dev.haskin._01.project;

import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StudentGame {
    private static final String DIFFICULTY_PROMPT = "Please choose a difficulty: EASY, MEDIUM, or HARD. Type INFO for difficulty information.";
    private static final String[] INFORMATION = {
            "Easy: guess a number - program will tell you if it was higher or equal (you win) or lower (computer wins) than the program's number.",
            "Medium: guess a number - program will tell you if it was strictly higher (you win) or lower or equal (computer wins) than the program's number.",
            "Hard: guess a number - program will tell you if it was equal (you win) or not (you lose) to the program's number." };

    enum Difficulty {
        EASY,
        MEDIUM,
        HARD,
        INFO;

        public static final String parseDifficulty(String difficulty) {
            return difficulty.trim().toUpperCase();
        }

        public static Optional<Difficulty> getDifficulty(String difficultyValue) {
            String difficultyValueFormatted = difficultyValue.trim().toUpperCase();
            if (EASY.name().equals(difficultyValueFormatted)) {
                return Optional.of(EASY);
            }

            if (MEDIUM.name().equals(difficultyValueFormatted)) {
                return Optional.of(MEDIUM);
            }

            if (HARD.name().equals(difficultyValueFormatted)) {
                return Optional.of(HARD);
            }

            if (INFO.name().equals(difficultyValueFormatted)) {
                return Optional.of(INFO);
            }

            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        // int exclusiveUpperBound = 11;
        // System.out.println(getRandomNumber());
        Difficulty gameDifficulty = getUserDifficulty();
        // outputDifficultyInformation();
        return;
    }

    /**
     * Outputs difficulty information in terminal
     */
    private static final void outputDifficultyInformation() {
        System.out.println();
        System.out.println("-------- Difficult Information -----------");
        IntStream.range(0, INFORMATION.length)
                .mapToObj(index -> INFORMATION[index])
                .forEach(System.out::println);
        System.out.println("------------------------------------------\n");
    }

    private static Difficulty getUserDifficulty() {
        String difficultyPrompt = "Please choose a difficulty: EASY, MEDIUM, or HARD. Type INFO for difficulty information.";
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.println(difficultyPrompt);
                    String userDifficulty = scanner.next();
                    Optional<Difficulty> optionalDifficulty = Difficulty.getDifficulty(userDifficulty);
                    if (optionalDifficulty.isPresent()) {
                        Difficulty difficulty = optionalDifficulty.get();
                        if (difficulty == Difficulty.INFO) {
                            outputDifficultyInformation();
                            continue;
                        }
                        return difficulty;
                    }

                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("\nInvalid choice given. Please try again.");
                    scanner.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Couldn't get user input. Default EASY difficulty will be used");
        }
        return Difficulty.EASY;
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
