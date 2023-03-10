package org.example;

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
        GeoTree gt = new GeoTree();

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

        new Reserch(gt).ageSort(18, '>');
        new Reserch(gt).ageSort(18, '<');

        gt.print();
    }
}
