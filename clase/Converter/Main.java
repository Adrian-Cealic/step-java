package com.step.homework.clase.Converter;
import java.util.Scanner;
import static java.lang.System.out;
import com.step.homework.clase.Converter.TempConverter;
public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        TempConverter temp = new TempConverter();
        out.println("Introdu grade celsius pentru a convert in farenhait");

        double c = scanner.nextDouble();
        temp.convertToFahre(c);

        out.println("Introdu fahr pentru a fo convertit in grade celsius");
        double f = scanner.nextDouble();
        temp.convertToCelsius(f);

    }




}
