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
        Person boris = new Person(("Борис"));
        GeoTree gt = new GeoTree();

        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.append(masha, petr);
        gt.append(masha, sasha);
        gt.append(anton, petr);
        gt.append(anton, sasha);
        gt.addMarried(anton, masha);

        System.out.println("Дети Ирины: " + new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println("Родители Пети: " + new Reserch(gt).spend(petr,
                Relationship.children));
        System.out.println(anton.getFullInfoAboutPerson() + " в браке с " + new Reserch(gt).spend(anton,
                Relationship.married));
        System.out.println(masha.getFullInfoAboutPerson() + " в браке с " + new Reserch(gt).spend(masha,
                Relationship.married));


        System.out.println("Люди старше 18 лет: " + new Reserch(gt).ageMore(18));
        System.out.println("Люди младше 18 лет: " + new Reserch(gt).ageLess(18));

        System.out.println(irina.getFullInfoAboutPerson());
        System.out.println(boris.getFullInfoAboutPerson());
    }
}
