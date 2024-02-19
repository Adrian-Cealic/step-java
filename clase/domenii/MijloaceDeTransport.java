package com.step.homework.clase.domenii;

public class MijloaceDeTransport {

    private String tip;
    private int viteza;
    private int locuri;
    public MijloaceDeTransport(String tip,int viteza,int locuri)
    {
        this.locuri = locuri;
        this.tip = tip;
        this.viteza = viteza;
    }
    public void show()
    {
        System.out.println("Mijlocul de transport de tipul "+tip+" are viteza maxima de "+viteza+" km/h si are "+locuri+" locuri");
    }
}
