package com.training.basics.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMatches1 {
    public static void main(String[] args) {
        String regex = "^apple$"; // Matches exactly "apple"
        Pattern pattern = Pattern.compile(regex);

        String text = "Found 'apple' in the text.";
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()) {
            System.out.println("The text matches 'apple'.");
        } else {
            System.out.println("The text does not match 'apple'.");
        }
    }
}
