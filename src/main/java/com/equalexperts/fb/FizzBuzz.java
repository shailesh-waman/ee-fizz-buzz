package com.equalexperts.fb;

public class FizzBuzz {

    public String parseNumbers(int start, int end) {
        final StringBuilder parsedResult = new StringBuilder();
        do {
            parsedResult.append(numberToWord(start)).append(" ");
            start++;
        } while (start <= end);

        return parsedResult.toString().trim();
    }

    private String numberToWord(Integer number) {
        if (containDigitThree(number)) return "lucky";
        else if (isMultipleOfFifteen(number)) return "fizzbuzz";
        else if (isMultipleOfThree(number)) return "fizz";
        else if (isMultipleOfFive(number)) return "buzz";
        else return number.toString();
    }

    private boolean isMultipleOfFive(Integer number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(Integer number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOfFifteen(Integer number) {
        return number % 15 == 0;
    }

    private boolean containDigitThree(Integer number) {
        return number % 10 == 3;
    }
}
