package com.step.homework.clase.domenii;

public class Mobila {
    private double pret;
    private String tip;
    public Mobila(String tip,double pret)
    {
        this.tip = tip;
        this.pret = pret;
    }
    public void show()
    {
        System.out.println("Mobila de tipul "+tip+" costa "+pret+" lei");
    }
}
