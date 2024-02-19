package com.step.secondLesson;

public final class ConstructorPerson { //todo:final - clasa n poate fi mostenita
    public final String name; //todo: variabila devine constanta
    public String surname;
    public String phoneNumber;
    public ConstructorPerson(String name,String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    public ConstructorPerson(String personName,String personSurname,String personPhoneNumber) //constrcutor parametrizat (cu parametri)
    {
        name = personName;
        surname = personSurname;
        phoneNumber = personPhoneNumber;
    }
}
