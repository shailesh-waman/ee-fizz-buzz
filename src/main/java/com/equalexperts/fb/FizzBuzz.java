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
        return number % 15 ==0 ? "fizzbuzz" : number % 3 ==0 ? "fizz": number % 5 ==0 ? "buzz" :  number.toString();
    }
}
