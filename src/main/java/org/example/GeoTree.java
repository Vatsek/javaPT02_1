package org.example;

import java.util.ArrayList;

public class GeoTree implements Printable{
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Relationship re, Relationship reverseRe, Person p2) {
        tree.add(new Node(p1, re, p2));
        tree.add(new Node(p2, reverseRe, p1));
    }

    @Override
    public void print() {
        for (Node i: tree) {
            System.out.println(i.p1.getFullName() + " " + i.re + " " + i.p2.getFullName());
        }

    }
}
