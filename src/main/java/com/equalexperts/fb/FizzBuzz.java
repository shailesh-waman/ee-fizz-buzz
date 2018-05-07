package com.equalexperts.fb;

import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzz {

    private static final Map<String, Integer> COUNT_REPORT = new LinkedHashMap<>();

    public FizzBuzz() {
        COUNT_REPORT.put("fizz", 0);
        COUNT_REPORT.put("buzz", 0);
        COUNT_REPORT.put("fizzbuzz", 0);
        COUNT_REPORT.put("lucky", 0);
        COUNT_REPORT.put("integer", 0);
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.parseNumbersWithReport(1, 20));

    }

    public String parseNumbersWithReport(int start, int end) {
        return parseNumbers(start, end) + " " + generateReport();
    }

    String parseNumbers(int start, int end) {
        final StringBuilder parsedResult = new StringBuilder();
        do {
            String numberToWord = numberToWord(start);
            parsedResult.append(numberToWord).append(" ");
            processReport(numberToWord);
            start++;
        } while (start <= end);

        return parsedResult.toString().trim();
    }

    private void processReport(String numberToWord) {
        if (COUNT_REPORT.containsKey(numberToWord)) {
            COUNT_REPORT.put(numberToWord, COUNT_REPORT.get(numberToWord) + 1);
        } else {
            COUNT_REPORT.put("integer", COUNT_REPORT.get("integer") + 1);
        }
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

    private String generateReport() {
        StringBuilder reportToString = new StringBuilder();
        for (Map.Entry<String, Integer> e : COUNT_REPORT.entrySet()) {
            reportToString
                    .append(" ")
                    .append(e.getKey())
                    .append(": ")
                    .append(e.getValue());
        }
        return reportToString.toString().trim();
    }
}

