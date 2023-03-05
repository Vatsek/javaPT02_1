package org.example;
import java.util.ArrayList;
import java.util.HashSet;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }
    public HashSet<String> ageMore(int age) {
        for (Node t: tree) {
            if (t.p1.getAge() >= age) {
                result.add(t.p1.getFullName());
            }
        }
        HashSet<String> result = new HashSet<>(this.result);
        return result;
    }
    public HashSet<String> ageLess(int age) {
        for (Node t: tree) {
            if (t.p1.getAge() < age && t.p1.getAge() >= 0) {
                result.add(t.p1.getFullName());
            }
        }
        HashSet<String> result = new HashSet<>(this.result);
        return result;
    }
}

