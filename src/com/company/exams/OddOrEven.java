package com.company.exams;

import static java.util.Arrays.stream;

class OddOrEven {
    OddOrEven (int[] array) {
        // your code
        String sum = stream(array).sum() % 2 == 0 ? "even" : "odd";

        System.out.println(sum);
    }
}
