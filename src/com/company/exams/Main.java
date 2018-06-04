package com.company.exams;

public class Main {

    public static void main(String[] args) {
        //new NthPrimeNumber(6);
        //new FizzBuzz(100);
        //new TwoSum(8);

        //BraceChecker braceChecker = new BraceChecker();
        //System.out.println(braceChecker.isValid("a{aAsd}[{}()]"));

        GiftPriorityQueue giftPriorityQueue = new GiftPriorityQueue();
        System.out.println(giftPriorityQueue.addGift("Water gun",1));// => returns 1
        System.out.println(giftPriorityQueue.addGift("Toy truck",4));// => returns 2
        System.out.println(giftPriorityQueue.addGift("Roller Skates",3));// => returns 3

        System.out.println(giftPriorityQueue.buyGift());// => returns 'Water gun'
        System.out.println(giftPriorityQueue.buyGift());// => returns 'Roller Skates'
        System.out.println(giftPriorityQueue.buyGift());// => returns 'Toy truck'
    }
}
