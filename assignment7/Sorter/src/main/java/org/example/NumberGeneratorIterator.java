package org.example;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class NumberGeneratorIterator implements Iterator<Integer> {

    private int numberOfIntegers;
    private int generated;
    private Random rand = new Random();
    private int upperbound = Integer.MAX_VALUE;

    public NumberGeneratorIterator(int size) {
        this.numberOfIntegers = size;
    }

    @Override
    public boolean hasNext() {
        return generated != numberOfIntegers;
    }

    @Override
    public Integer next() {
        generated++;
        return rand.nextInt(upperbound);
    }
}
