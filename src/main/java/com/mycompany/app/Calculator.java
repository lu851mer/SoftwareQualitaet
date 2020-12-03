package com.mycompany.app;

public class Calculator implements ICalculator {
    @Override
    public int additionFromIntegers(int zahl1, int zahl2) {
        return zahl1+zahl2;
    }

    @Override
    public int subtractFromIntegers(int zahl1, int zahl2) {
        return zahl1-zahl2;
    }

    @Override
    public int divisionFromIntegers(int zahl1, int zahl2) {
        return zahl1/zahl2;
    }

    @Override
    public int multiplicationFromIntegers(int zahl1, int zahl2) {
        return zahl1*zahl2;
    }
}
