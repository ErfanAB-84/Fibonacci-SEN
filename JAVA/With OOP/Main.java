package com.company;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // EXE
        // loop , ifandElse , a bit class , methood overloading , swich/case , var :)
        Fibunachi EulerProject = new Fibunachi();
        EulerProject.maxnumber = 10;
        EulerProject.prossec();
        ArrayList<Integer> out = EulerProject.runer();

        EvenNumber EulerProjectR = new EvenNumber();

        for (int v :
                out) {
            if (EulerProjectR.Search(v)) {
                EulerProjectR.sumset = EulerProjectR.sumset + v;
            }
        }
        System.out.println("FULL Fibonacci sequence(EVEN numbers) //");
        for (int v :
                out) {
            if (EulerProjectR.Search(v)) {
                System.out.println(v);
            }
        }
        System.out.println("sum this Even numbers in fibonacci!!");
        System.out.println(EulerProjectR.sumset);
    }
}