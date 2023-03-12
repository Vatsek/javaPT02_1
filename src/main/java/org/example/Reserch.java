package org.example;
import java.util.ArrayList;
import java.util.HashSet;

public class Reserch {
    ArrayList<Person> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<Person> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2);
            }
        }
        return result;
    }
        public HashSet<Person> ageSort(int age, char ch) {
        if (ch == '>') {
            for (Node t: tree) {
                if (t.p1.getAge() >= age) {
                    result.add(t.p1);
                }
            }
        }
        else {
            for (Node t: tree) {
                if (t.p1.getAge() < age && t.p1.getAge() >= 0) {
                    result.add(t.p1);
                }
            }
        }
        HashSet<Person> result = new HashSet<>(this.result);
        return result;
    }
}

