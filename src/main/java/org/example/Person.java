package org.example;

public class Person implements Comparable<Person> {
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

    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else return this.getFullName().equals(((Person) obj).getFullName()) && this.getAge() == ((Person) obj).getAge();
    }

    @Override
    public String toString() {
        return this.getFullName();
    }
}
