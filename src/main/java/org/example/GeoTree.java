package org.example;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
    public void addMarried(Person husband,Person wife) {
        tree.add(new Node(husband, Relationship.married, wife));
        tree.add(new Node(wife, Relationship.married, husband));
    }
}
