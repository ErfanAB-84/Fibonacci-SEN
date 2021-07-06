package com.company;

import java.util.ArrayList;

public class Fibunachi {
    ArrayList<Integer> listOfwal = new ArrayList<>();
    int maxnumber;

    public void prossec() {
        int n = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        listOfwal.add(firstNumber);
        listOfwal.add(secondNumber);
        while (n < maxnumber) {
            int finalnumber = firstNumber + secondNumber;
            listOfwal.add(finalnumber);
            firstNumber = secondNumber;
            secondNumber = finalnumber;
            n++;
        }
    }

    public ArrayList runer() {
        return listOfwal;
    }
}


