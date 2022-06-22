package dev.haskin._01;

public class LoopLab {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear + 1;
        while (currentYear < targetYear) {
            if (currentYear - startingYear == 1) {
                System.out.println((currentYear - startingYear) + " year have passed");
                currentYear++;
                continue;
            }

            System.out.println((currentYear - startingYear) + " year(s) have passed");
            currentYear++;
        }
        // extension(startingYear, targetYear);
    }

    public static void extension(final int startingYear, final int targetYear) {
        for (int currentYear = startingYear + 1; currentYear < targetYear; currentYear++) {
            if (currentYear - startingYear == 1) {
                System.out.println((currentYear - startingYear) + " year have passed");
                currentYear++;
                continue;
            }
            System.out.println((currentYear - startingYear) + " year(s) have passed");
        }
    }
}
