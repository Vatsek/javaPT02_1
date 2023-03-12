package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 55);
        Person vasya = new Person("Вася", 30 );
        Person masha = new Person("Маша", 28);
        Person jane = new Person("Женя", 5);
        Person ivan = new Person("Ваня", 3);
        Person anton = new Person("Антон", 29);
        Person petr = new Person("Петя", 6);
        Person sasha = new Person("Саша", 7);
        Person petr1 = new Person("Петя", 6);
        Person sasha1 = new Person("Саша", 2);
        GeoTree gt = new GeoTree();

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(irina);
        persons.add(vasya);
        persons.add(masha);
        persons.add(jane);
        persons.add(ivan);
        persons.add(anton);
        persons.add(petr);
        persons.add(sasha);
        persons.add(petr1);
        persons.add(sasha1);

        gt.append(irina, Relationship.parent, Relationship.children, vasya);
        gt.append(irina, Relationship.parent, Relationship.children, masha);
        gt.append(vasya, Relationship.parent,Relationship.children, jane);
        gt.append(vasya, Relationship.parent, Relationship.children, ivan);
        gt.append(masha, Relationship.parent, Relationship.children, petr);
        gt.append(masha, Relationship.parent, Relationship.children, sasha);
        gt.append(anton, Relationship.parent, Relationship.children, petr);
        gt.append(anton, Relationship.parent, Relationship.children, sasha);
        gt.append(anton, Relationship.wife, Relationship.husband, masha);
        gt.append(masha, Relationship.married, Relationship.married, anton);

        System.out.println("Дети Ирины: " + new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println("Родители Пети: " + new Reserch(gt).spend(petr,
                Relationship.children));
        System.out.println(anton.getFullName() + " женат на " + new Reserch(gt).spend(anton,
                Relationship.wife));
        System.out.println(masha.getFullName() + " за мужем за " + new Reserch(gt).spend(masha,
                Relationship.husband));
        System.out.println(masha.getFullName() + " в браке с " + new Reserch(gt).spend(masha,
                Relationship.married));

        ArrayList<Person> personOlderThat = new ArrayList<>(new Reserch(gt).ageSort(18, '>'));
        Collections.sort(personOlderThat, new PersonAgeComparator());
        System.out.println("Люди старше 18 лет, отсортированные по возрасту:\n" + personOlderThat);
        ArrayList<Person> personYoungerThat = new ArrayList<>(new Reserch(gt).ageSort(18, '<'));
        System.out.println("Люди младше 18 лет, отсортированные по возрасту:\n" + personYoungerThat);

//        gt.print();

        System.out.println(petr.equals(petr1));
        System.out.println(sasha.equals(sasha1));

        Collections.sort(persons, new PersonNameComparator());
        System.out.println("Люди, отсортированные по алфавиту: \n" + persons);
    }
}
