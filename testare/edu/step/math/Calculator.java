package com.step.testare.edu.step.math;

public class Calculator {
//--------SARCINA 1.1-----------
    public int adunare(int n1,int n2)
    {
        return n1+n2;
    }
    public double adunare(double n1,double n2)
    {
        return n1+n2;
    }

    public int scadere(int n1,int n2)
    {
        return n1-n2;
    }

    public double scadere(double n1,double n2)
    {
        return n1-n2;
    }

    public int produs(int n1,int n2)
    {
        return n1*n2;
    }
    public double produs(double n1,double n2)
    {
        return n1*n2;
    }

    public int impartire(int n1,int n2)
    {
        if(n2==0)
        {
            return -1;
        }
        else return n1/n2;
    }
    public double impartire(double n1,double n2) {
        if (n2 == 0) {
            return -1;
        } else {
            return n1 / n2;
        }
    }

//-------Sarcina 1.2----------
public void tablaInmultirii(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+ i +" = " +n*i);
        }
    }

//------SARCINA 1.3------
public void sumaNumerelor(int n)
{
    int rez=0;
    for (int i=0;i<=n;i++)
    {
        rez+=i;
    }
    System.out.println(rez);
}

}
