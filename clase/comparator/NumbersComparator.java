package com.step.homework.clase.comparator;
import com.step.homework.clase.comparator.App;
public class NumbersComparator {
    public void maxim(int termen1,int termen2) {
        if (termen1 > termen2) {
            System.out.println("Termenul " + termen1 + " este maximul");
        } else {
            System.out.println("Termenul " + termen1 + " este minim");
        }
    }
    public void minim(int termen1,int termen2)
    {

        if(termen2>termen1)
        {
            System.out.println("Termenul "+termen2+" este maxim");
        }
        else
        {
            System.out.println("Termeneul "+termen2+" este minim");
        }
    }
}
