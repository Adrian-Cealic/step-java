package com.step.homework.clase.calculator;
import static java.lang.System.out;
public class Calculator {

    public void Adunare(double termen1,double termen2)
    {
        out.println(termen1+termen2);
    }
    public void Scadere(double scazator1,double scazator2)
    {
        out.println(scazator1-scazator2);
    }
    public void Inmultire(double inmultit1,double inmultit2)
    {
        out.println(inmultit1*inmultit2);
    }
    public double Impartire(double numarator,double numitor)
    {
        if(numitor==0)
        {
            out.println("EROARE!Impartirea la zero nu are loc.");
            return 0;
        }
        else {
            return (numarator/numitor);
        }
    }


}
