package org.example;

import java.util.ArrayList;

public class GeoTree implements Printable{
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Relationship re, Person p2) {
        if (re == Relationship.parent) {
            tree.add(new Node(p1, re, p2));
            tree.add(new Node(p2, Relationship.children, p1));
        } else if (re == Relationship.children) {
            tree.add(new Node(p2, re, p1));
            tree.add(new Node(p1, Relationship.parent, p2));
        } else if (re == Relationship.husband) {
            tree.add(new Node(p1, re, p2));
            tree.add(new Node(p2, Relationship.wife, p1));
            tree.add(new Node(p1, Relationship.married, p2));
            tree.add(new Node(p2, Relationship.married, p1));
        } else if (re == Relationship.wife) {
            tree.add(new Node(p1, re, p2));
            tree.add(new Node(p2, Relationship.husband, p1));
            tree.add(new Node(p1, Relationship.married, p2));
            tree.add(new Node(p2, Relationship.married, p1));
        }
    }

    @Override
    public void print() {
        ArrayList<String> print = new ArrayList();
        for (Node i: tree) {
            System.out.println(i.p1.getFullName() + " " + i.re + " " + i.p2.getFullName());
        }

    }
}
