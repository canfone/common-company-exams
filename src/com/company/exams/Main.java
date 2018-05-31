package com.company.exams;

public class Main {

    public static void main(String[] args) {
        //new NthPrimeNumber(6);
        //new FizzBuzz(100);
        //new TwoSum(8);

        BraceChecker braceChecker = new BraceChecker();

        System.out.println(braceChecker.isValid("{asd}[{(})]"));
    }
}
