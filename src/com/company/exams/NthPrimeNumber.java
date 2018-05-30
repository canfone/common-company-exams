package com.company.exams;

class NthPrimeNumber {

    NthPrimeNumber(int nth) {
        int primeNumber = 0;
        for(int i = 1, counter = 0; counter < nth; i++) {
            if(isPrime(i)) {
                counter++;
                primeNumber = i;
            }
        }

        System.out.println(primeNumber);
    }


    private boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
