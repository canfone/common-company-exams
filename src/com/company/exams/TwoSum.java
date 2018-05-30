package com.company.exams;

class TwoSum {
    TwoSum(int nth) {
        System.out.println(getPrevSum(nth));
    }

    private int getPrevSum(int nth) {
        int prevSum = 1;
        for (int i = 0; i < nth; i++) {
            if(i < 2) {
                continue;
            }
            prevSum = getPrevSum(i - 1) + getPrevSum(i);
        }

        return prevSum;
    }
}
