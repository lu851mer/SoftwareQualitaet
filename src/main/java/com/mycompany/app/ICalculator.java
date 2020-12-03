package com.mycompany.app;

/**
 * Interface which contains methods to add, subtract, divide and multiplicate two Integers
 */
public interface ICalculator {

    /**
     *
     * @param zahl1 the number which is added to zahl2
     * @param zahl2 the number which is added to zahl1
     * @return the solution from the calculation
     */
    int additionFromIntegers(int zahl1, int zahl2);


    /**
     *
     * @param zahl1 the number from which is zahl2 subtracted
     * @param zahl2 the number which is subtracted to zahl1
     * @return the solution from the calculation
     */
    int subtractFromIntegers(int zahl1, int zahl2);


    /**
     *
     * @param zahl1 the number from which is zahl2 divided
     * @param zahl2 the number which is divided to zahl1
     * @return the solution from the calculation
     */
    int divisionFromIntegers(int zahl1, int zahl2);


    /**
     *
     * @param zahl1 the number from which is zahl2 multiplicated
     * @param zahl2 the number which is multiplicated to zahl1
     * @return the solution from the calculation
     */
    int multiplicationFromIntegers (int zahl1, int zahl2);
}
