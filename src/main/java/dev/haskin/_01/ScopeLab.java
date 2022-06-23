package dev.haskin._01;

public class ScopeLab {

    // public static void main(String[] args) {
    // boolean flag = false;
    // if (flag) {
    // // do something when flag is true
    // int numberWhenFlagIsTrue = 12;
    // } else {
    // // do something else when flag is false
    // int numberWhenFlagIsFalse = 5;
    // }
    // System.out.println(numberWhenFlagIsTrue); // <- this will not work because
    // numberWhenFlagIsTrue is not in scope
    // }

    public static void main(String[] args) {
        boolean flag = false;
        int number;
        if (flag) {
            // do something when flag is true
            number = 12;
        } else {
            // do something else when flag is false
            number = 5;
        }
        System.out.println(number);
    }
}
