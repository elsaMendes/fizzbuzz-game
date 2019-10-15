package com.exercice.alfresco;

public class FizzBuzzGame {

    public void start(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(print(i) + " ");
        }
    }

    public String print(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0)
            return "buzz";

        return number + "";
    }
}
