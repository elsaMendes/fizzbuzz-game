package com.exercice.alfresco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzGameTest {

    FizzBuzzGame fizzBuzzGame;

    @Before
    public void setUp() throws Exception {
        fizzBuzzGame = new FizzBuzzGame();
    }


    @Test
    public void gameShouldProduceTheNumberItself() {
        assertTrue(fizzBuzzGame.print(1).equals("1"));
    }

    //‘fizz’ for numbers that are multiples of 3
    @Test
    public void gameShouldProduceFizzForNumbersThatAreMultiplesOf3() {
        assertTrue(fizzBuzzGame.print(9).equals("fizz"));
    }

    //'buzz’ for numbers that are multiples of 5
    @Test
    public void gameShouldProduceBuzzforNumbersThatAreMultiplesOf5() {
        assertTrue(fizzBuzzGame.print(10).equals("buzz"));
    }

    //'fizzbuzz’ for numbers that are multiples of 15
    @Test
    public void gameShouldProduceFizzBuzzForNumbersThatAreMultiplesOf15() {
        assertTrue(fizzBuzzGame.print(15).equals("fizzbuzz"));
    }
}