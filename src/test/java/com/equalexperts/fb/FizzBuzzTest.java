package com.equalexperts.fb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz subject;

    @Before
    public void setUp() throws Exception {
        subject = new FizzBuzz();
    }

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
        int start = 6;
        int end = 6;

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
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz", parsedResult);
    }

    @Test
    public void numberContainDigitThree_parseNumbers_lucky() {
        // given
        int start = 13;
        int end = 13;

        // when
        String parsedResult = subject.parseNumbers(start, end);

        // then
        assertEquals("lucky", parsedResult);
    }

    @Test
    public void rangeFromOneToTwenty_parse_numbersWithFizzAndBuzzAndFizzBuzzWithReport() {
        // given
        int start = 1;
        int end = 20;

        // when
        String parsedResult = subject.parseNumbersWithReport(start, end);

        // then
        assertEquals(
                "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10",
                parsedResult
        );
    }
}
