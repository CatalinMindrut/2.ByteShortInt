package com.Catalin;

public class Main {

    public static void main(String[] args) {

        // Int has a width of 32
	    int myMinValue = -2_147_483_648;
	    /** The number is a literal,
         * a fixed number, not a variable or a primitive data type.
         * int myMinValue = (a*b) This is an expression, not a literal.
         * You can put _ in numbers to make them easier to read */

        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = 127;
        byte myMinByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        /** Adding the data type in front of an expression is called casting */

//        byte myNextByteValue = (myByteValue/2);
        /** This is invalid (remove comment) because you are trying to fit an integer into a byte data type.
         * On the left side it is stated that the variable is a byte but on the right side, the value is
         * an integer, because Java automatically converts expressions to integers.
         * If the right side data type was a literal, a fixed number, Java would just use it as a byte and
         * only considered it an integer if the value exceeded the boundaries of the primitive data type defined on
         * the left side.
         */
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myMinShortValue = -32768;

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;
        long myMinLongValue = -9_223_372_036_854_775_808L;


        //Challenge
        int newInteger = 2000;
        byte newByte = 100;
        short newShort = 30000;
        long newLong = 5000 + 10 * (newInteger + newByte + newShort);
        System.out.println("New value equals " + newLong);
    }
}
