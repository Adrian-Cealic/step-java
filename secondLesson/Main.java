package com.step.secondLesson;
public class Main {

    private String name;
    private int age;

    // Constructor 1 with String as parameter.
    public Main(String name)
    {
        // This line of code calls the second constructor.
        this(20);
        System.out.println("Name of Student : " + name);
    }

    // Constructor 2 with int in parameter.
    public Main(int age)
    {
        System.out.println("Age of student = " + age);
    }

    // Constructor 3 with no parameters.
    public Main()
    {
        // This line calls the first constructor.
       this("Geeks");
    }

    public static void main(String[] args)
    {
        // This calls the third constructor.
        Main student = new Main();
    }
}
