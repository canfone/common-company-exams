package com.company.exams;

public class GetMiddle {
    GetMiddle(String word) {
        String middleChars = word.substring((int) Math.ceil(word.length() / 2.0) - 1, (int) Math.floor(word.length() / 2.0) + 1);
        System.out.println(middleChars);
    }

}
