package com.company;

public class Main {

    public static void main(String[] args){
        BinaryComparator comparator = new BinaryComparator(new SimpleGenerator(16807), new SimpleGenerator(48271));
        System.out.println(comparator.compareNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}
