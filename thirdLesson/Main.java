package com.step.thirdLesson;

public class Main {
//ENCAPSULATION
    private int x = 20;

    //getter RETURMEAZA VALOAREA
    public int getX()
    {
        return x;
    }
    //setter MODIFICA VALOAREA
    public void setX(int x)
    {
        if(x>0)
        {
            this.x = x;
        }
    }
}
