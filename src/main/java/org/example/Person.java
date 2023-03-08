package org.example;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return this.fullName;
    }
    public int getAge(){
        return age;
    }

    public  String getFullInfoAboutPerson(){
        return this.fullName + ", возраст " + this.age + " лет";
    }
}
