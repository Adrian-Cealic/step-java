package com.step.homework.clase.Converter;

import static java.lang.System.out;

public class TempConverter {

    public void convertToFahre(double celsius)
    {
        out.println(celsius*((double) 9 / 5)+32);
    }
    public void convertToCelsius(double fahr)
    {
        out.println((fahr-32)*5/9);
    }
}
