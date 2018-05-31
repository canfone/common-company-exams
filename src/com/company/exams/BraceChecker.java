package com.company.exams;

import java.util.ArrayList;
import java.util.HashMap;

class BraceChecker {

    private ArrayList<Character> bracesValidatorArray = new ArrayList<>();
    private HashMap<Character, Character> bracePair = new HashMap<>();

    BraceChecker() {
        bracePair.put('(', ')');
        bracePair.put('{', '}');
        bracePair.put('[', ']');
    }

    boolean isValid(String braces) {
        char[] bracesCharArray = braces.toCharArray();

        for (char element : bracesCharArray) {
            if(bracePair.containsKey(element) || bracePair.containsValue(element)) {
                bracesValidatorArray.add(element);
            }

            if(isPair()) {
                bracesValidatorArray.remove(bracesValidatorArray.size() - 1);
                bracesValidatorArray.remove(bracesValidatorArray.size() - 1);
            }
        }
        return bracesValidatorArray.size() <= 0;
    }

    private boolean isPair() {
        try {
            char head = bracesValidatorArray.get(bracesValidatorArray.size() - 2);
            char tail = bracesValidatorArray.get(bracesValidatorArray.size() - 1);
            return bracePair.get(head) == tail;
        } catch (Exception e) {
            return false;
        }
    }
}
