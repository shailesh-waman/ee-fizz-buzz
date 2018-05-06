package com.equalexperts.fb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz subject = new FizzBuzz();

    @Test
    public void oneNumberRange_parseNumbers_number() {
        // given
        int start = 1;
        int end = 1;

        // when
        String parsedResult = subject.parseNumbers(start, end);

        // then
        assertEquals("1", parsedResult);
    }

    @Test
    public void oneToTwoNumberRange_parseNumbers_numbersWithSpace() {
        // given
        int start = 1;
        int end = 2;

        // when
        String parsedResult = subject.parseNumbers(start, end);

        // then
        assertEquals("1 2", parsedResult);
    }


    @Test
    public void rangeWithMultipleOfThree_parseNumbers_fizz() {
        // given
        int start = 3;
        int end = 3;

        // when
        String parsedResult = subject.parseNumbers(start, end);

        // then
        assertEquals("fizz", parsedResult);
    }

    @Test
    public void rangeWithMultipleOfFive_parseNumbers_buzz() {
        // given
        int start = 5;
        int end = 5;

        // when
        String parsedResult = subject.parseNumbers(start, end);

        // then
        assertEquals("buzz", parsedResult);
    }

    @Test
    public void rangeWithMultipleOfFifteen_parseNumbers_fizzBuzz() {
        // given
        int start = 15;
        int end = 15;

        // when
        String parsedResult = subject.parseNumbers(start, end);

        // then
        assertEquals("fizzbuzz", parsedResult);
    }

    @Test
    public void rangeFromOneToTwenty_parseNumbers_numbersWithFizzAndBuzzAndFizzBuzz() {
        // given
        int start = 1;
        int end = 20;

        // when
        String parsedResult = subject.parseNumbers(start, end);

        // then
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz", parsedResult);
    }
}
