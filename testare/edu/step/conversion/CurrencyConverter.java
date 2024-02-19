package com.step.testare.edu.step.conversion;

import java.util.Scanner;
public class CurrencyConverter {
    Scanner scanner = new Scanner(System.in);
    float rataConversie;
    public void setareRataConversie() {
        System.out.println("Seteaza rata de conversie:");
        rataConversie = scanner.nextFloat();
    }
    public float exchangeToMDL(float euro)
    {
        return euro * rataConversie;
    }
    public float exchangeToEUR(float lei)
    {
        return lei/rataConversie;
    }

    public static void main(String[] args) {
        CurrencyConverter convert = new CurrencyConverter();
        convert.setareRataConversie();
        float lei = convert.exchangeToMDL(20);
        System.out.println("20 euro = "+lei +"MDL");
        float euro = convert.exchangeToEUR(20);
        System.out.println("20 lei ="+euro+" euro" );
    }
}
