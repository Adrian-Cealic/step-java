package com.step.homework.clase.comparator;
import com.step.homework.clase.comparator.NumbersComparator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumbersComparator comp = new NumbersComparator();
        int n1,n2;
        String comparat;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        comparat = scanner.next();

        switch (comparat)
        {
            case "maxim" :
            {
                comp.maxim(n1,n2);
                break;
            }
            case "minim" :
            {
                comp.minim(n1,n2);
                break;
            }

        }
    }

}
