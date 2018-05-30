package com.company.exams;

class FizzBuzz {
    FizzBuzz(int number) {
        for(int i = 1; i <= number; i++) {
            String text = "";
			text += (i % 3) == 0 ? "fizz" : "";
			text += (i % 5) == 0 ? "buzz" : "";
			System.out.println(!text.isEmpty() ? text : i);
        }
    }
}
