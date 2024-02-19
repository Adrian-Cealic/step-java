package com.step.homework.clase.domenii;

public class Electrocasnice {
    public int consum=0;
    public String marca;
    public boolean onOff;
    public Electrocasnice(String marca,int consum)
    {
        this.marca = marca;
        this.consum = consum;
    }
    public void on()
    {
        System.out.println("Electrocasnicul de marca "+marca+" a fost pornit");
        onOff = true;
    }
    public void off()
    {
        System.out.println("Electrocasnicul de marca"+marca+"a fost oprit");
        onOff = false;
    }

}
