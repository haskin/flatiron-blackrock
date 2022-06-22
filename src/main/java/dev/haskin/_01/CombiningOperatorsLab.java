package dev.haskin._01;

public class CombiningOperatorsLab {

    private static final String TRUTH_TABLE_STRING = "Truth table for %s operator \n" +
            "%s %s %s = %s \n" +
            "%s %s %s = %s \n" +
            "%s %s %s = %s \n" +
            "%s %s %s = %s \n";

    public static void main(String[] args) {
        System.out.println(createTruthTable("&&"));
        System.out.println(createTruthTable("||"));
    }

    /**
     * Returns a string representing a truth table
     * 
     * Truth table for && operator
     * true && true = true
     * true && false = false
     * false && false = false
     * false && true = false
     * 
     * @param operator
     * @return
     */
    public static String createTruthTable(String operator) {
        switch (operator) {
            case ("&&"):
                return String.format(TRUTH_TABLE_STRING, operator, Boolean.TRUE, operator, Boolean.TRUE,
                        (Boolean.TRUE && Boolean.TRUE), Boolean.TRUE,
                        operator, Boolean.FALSE, (Boolean.TRUE && Boolean.FALSE), Boolean.FALSE, operator,
                        Boolean.FALSE, (Boolean.FALSE && Boolean.FALSE), Boolean.FALSE, operator,
                        Boolean.TRUE, (Boolean.FALSE && Boolean.TRUE));
            case ("||"):
                return String.format(TRUTH_TABLE_STRING, operator, Boolean.TRUE, operator, Boolean.TRUE,
                        (Boolean.TRUE || Boolean.TRUE), Boolean.TRUE,
                        operator, Boolean.FALSE, (Boolean.TRUE || Boolean.FALSE), Boolean.FALSE, operator,
                        Boolean.FALSE, (Boolean.FALSE || Boolean.FALSE), Boolean.FALSE, operator,
                        Boolean.TRUE, (Boolean.FALSE || Boolean.TRUE));
            default:
                return "Invalid arguement choosen";
        }
    }
}
