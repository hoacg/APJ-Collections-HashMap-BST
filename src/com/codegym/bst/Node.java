package com.codegym.bst;

public class Node<T extends Comparable>{
    public T element;

    public Node<T> left;
    public Node<T> right;

    public Node(T t) {
        this.element = t;
    }
}
