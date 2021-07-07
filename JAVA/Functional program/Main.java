package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> hi = new ArrayList<>();
        int number = 10;
        int n = 0;

        int firstNumber = 0;
        int secondNumber = 1;
        while (n < number) {
            int finalnumber = firstNumber + secondNumber;
            if(EvenNumber(finalnumber)){
                hi.add(finalnumber);
            }
            firstNumber = secondNumber;
            secondNumber = finalnumber;
            n++;
        }
        int sumset = 0;
        for (int y:
             hi) {
            sumset = sumset + y;
        }
        System.out.println(sumset);
    }

    public static boolean EvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}