package com.company.exams;

import java.util.HashMap;
import java.util.Stack;

class BraceChecker {

    private Stack<Character> bracesValidatorArray = new Stack<>();
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
                bracesValidatorArray.push(element);
            }

            if(isPair()) {
                bracesValidatorArray.pop();
                bracesValidatorArray.pop();
            }
        }
        return bracesValidatorArray.size() <= 0;
    }

    private boolean isPair() {
        if(bracesValidatorArray.size() < 2) {
            return false;
        }

        char head = bracesValidatorArray.get(bracesValidatorArray.size() - 2);
        char tail = bracesValidatorArray.get(bracesValidatorArray.size() - 1);

        if(!bracePair.containsKey(head)) {
            return false;
        }

        return bracePair.get(head) == tail;

    }
}
