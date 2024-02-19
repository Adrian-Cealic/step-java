package com.step.homework.clase.calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calcule = new Calculator();
        //variabile
        double termen1,termen2;
        char op;

        System.out.println("Introdu o operatie");
        op = scanner.next().charAt(0);


        switch (op)
        {
            case '+':
            {
                termen1 = scanner.nextDouble();
                termen2 = scanner.nextDouble();
                calcule.Adunare(termen1,termen2);
                break;
            }
            case '-':
            {
                termen1 = scanner.nextDouble();
                termen2 = scanner.nextDouble();
                calcule.Scadere(termen1,termen2);
                break;
            }
            case '*':
            {
                termen1 = scanner.nextDouble();
                termen2 = scanner.nextDouble();
                calcule.Inmultire(termen1,termen2);
                break;
            }
            case '/':
            {
                 termen1 = scanner.nextDouble();
                 termen2 = scanner.nextDouble();
                calcule.Impartire(termen1,termen2);
                break;
            }
        }
        scanner.close();

    }
}
