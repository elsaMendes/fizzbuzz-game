package com.exercice.alfresco;

public class FizzBuzzGame {

    public void start(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(print(i) + " ");
        }
    }

    public String print(int number) {
        if (String.valueOf(number).indexOf("3") != -1) {
            return "alfresco";
        } else if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0)
            return "buzz";

        return number + "";
    }
}
//1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz
