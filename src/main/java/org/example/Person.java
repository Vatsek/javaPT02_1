package org.example;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(String fullName) {
        this.age = -1;
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }
    public int getAge(){
        return age;
    }

    public  String getFullInfoAboutPerson(){
        if (age == -1){
            return this.fullName + ", возраст не указан";
        }
        return this.fullName + ", возраст " + this.age + " лет";
    }
}
