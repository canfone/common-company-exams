package com.company.exams;

class DontGiveMeFive {
    DontGiveMeFive(int start, int end) {
        int count = 0;
        for (;start <= end;start++) {
            if(!containsFive(start))
                count++;
        }

        System.out.println(count);
    }

    private boolean containsFive(int num) {
        String numToString = String.valueOf(num);

        return numToString.contains("5");
    }
}
