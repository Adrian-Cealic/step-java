package com.step.homework.clase.domenii;

public class Profesii {
    private String nume;
    private int salariu;
    public Profesii(String nume,int salariu)
    {
        this.nume = nume;
        this.salariu = salariu;
    }
    public void showSalary()
    {
        System.out.println("Salariul pentru profesia "+nume+" este de "+salariu+" lei");
    }
}
