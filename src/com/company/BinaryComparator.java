package com.company;

public class BinaryComparator implements NumberComparator{

    private final int ITERATIONS = 1000000;

    private NumberGenerator generatorA;
    private NumberGenerator generatorB;

    public BinaryComparator(NumberGenerator generatorA, NumberGenerator generatorB){
        this.generatorA = generatorA;
        this.generatorB = generatorB;
    }

    public void setGeneratorA(NumberGenerator generatorA){
        this.generatorA = generatorA;
    }

    public void setGeneratorB(NumberGenerator generatorB){
        this.generatorB = generatorB;
    }

    @Override
    public int compareNumbers(long numA, long numB) {
        int count = 0;
        for(int i = 0; i < ITERATIONS; i++){
            numA = generatorA.generateNumber(numA);
            numB = generatorB.generateNumber(numB);
            if(firstEightBitsEqual(numA, numB)){
                count++;
            }
        }
        return count;
    }

    private boolean firstEightBitsEqual(long numA, long numB){
        String binaryA = convertToBinaryOfEightBits(numA);
        String binaryB = convertToBinaryOfEightBits(numB);
        return binaryA.substring(binaryA.length() - 8).equals(binaryB.substring(binaryB.length() - 8));
    }

    private String convertToBinaryOfEightBits(long num){
        String binary = Long.toBinaryString(num);
        while(binary.length() < 8){
            binary = "0".concat(binary);
        }
        return binary;
    }
}
