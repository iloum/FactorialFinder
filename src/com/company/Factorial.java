package com.company;

public class Factorial {

    public static int GetFactorial(int number) {

        if (number==0) {
            return 1;
        }

        return  number*GetFactorial(number-1);

    }
}
