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
    public void gameShouldProduce_theNumberItself_ifNotMultipleOf3or5or15() {
        assertTrue(fizzBuzzGame.print(1).equals("1"));
    }

    //‘fizz’ for numbers that are multiples of 3
    @Test
    public void gameShouldProduce_fizz_forNumbersThatAreMultiplesOf3() {
        assertTrue(fizzBuzzGame.print(9).equals("fizz"));
    }

    //'buzz’ for numbers that are multiples of 5
    @Test
    public void gameShouldProduce_buzz_forNumbersThatAreMultiplesOf5() {
        assertTrue(fizzBuzzGame.print(10).equals("buzz"));
    }

    //'fizzbuzz’ for numbers that are multiples of 15
    @Test
    public void gameShouldProduce_fizzbuzz_forNumbersThatAreMultiplesOf15() {
        assertTrue(fizzBuzzGame.print(15).equals("fizzbuzz"));
    }

    //If the number contains a three you must output the text ‘alfresco’, any other rule is skipped
    @Test
    public void shouldProduce_alfresco_ifNumberContains3(){
        assertTrue(fizzBuzzGame.print(13).equals("alfresco"));
    }
}