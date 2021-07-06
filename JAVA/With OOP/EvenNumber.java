package com.company;

import java.util.ArrayList;
import java.util.List;
public class EvenNumber {

    int sumset;
    public EvenNumber(){
        this.sumset = 0;
    }

    public boolean Search(int numbers) {
        boolean out;
        if (numbers % 2 == 0) {
            out = true;
        } else {
            out = false;
        }
        return out;
    }
}
