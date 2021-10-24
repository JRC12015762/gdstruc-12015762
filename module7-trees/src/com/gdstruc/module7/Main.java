package com.gdstruc.module7;

public class Main {

    public static void main(String[] args) {
	Tree tree = new Tree();

        tree.insert(73);
        tree.insert(90);
        tree.insert(77);
        tree.insert(9);
        tree.insert(22);
        tree.insert(78);
        tree.insert(66);
        tree.insert(41);
        tree.insert(36);
        tree.insert(37);

        //tree.traverseInOrder();
        //System.out.println(tree.get(22));
        System.out.println("Min " + tree.getMin());
        System.out.println("Max " + tree.getMax());
        tree.traverseInOrderDescending();

    }
}
