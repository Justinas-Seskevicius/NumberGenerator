package com.company;

public class Main {

    public static void main(String[] args){
        BinaryComparator comparator = new BinaryComparator(new SimpleGenerator(16807), new SimpleGenerator(48271));
        System.out.println(comparator.compareNumbers(Long.parseLong(args[0]), Long.parseLong(args[1])));
    }
}
