package com.codegym;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StudentIterable implements Iterable<Student> {
    @Override
    public Iterator<Student> iterator() {
    return null;
}

    @Override
    public void forEach(Consumer<? super Student> action) {

    }

    @Override
    public Spliterator<Student> spliterator() {
        return null;
    }
}
