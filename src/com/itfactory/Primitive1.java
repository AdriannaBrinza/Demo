package com.itfactory;

public class Primitive1 {
    public static void main(String[] args)
    {
        int intValue1= 1;
        int intValue2 = 5; //am modificat din 5.1 in 5

        long longValue1 = 150000L;
        long longValue2 = 1000000000000000000L;//nr initial are 35 de cifre, am lasat numai 19

        float floatValue1 = 1.3f;
        float floatValue2 = 23.123123f; //am adaugat "f" la finalul numarului zecimal

        double doubleValue1 = 2.5d;
        double doubleValue2 = 123.443423;

        boolean booleanValue1 = true;
        boolean booleanValue2 = false;//am inlocuit "5" cu valoarea "false"

        char charValue1 = 'a';
        char charValue2 = 'c'; //in loc de "67c" am pus doar 'c'
        char charValue3 = 67; // este corect si asa. 67 este numarul Unicode aferent literei "C".

        System.out.println("intValue1: " + intValue1);
        System.out.println("intValue2: " + intValue2);
        System.out.println("longValue1:" + longValue1);
        System.out.println("longValue2: " + longValue2);
        System.out.println("floatValue1: " + floatValue1);
        System.out.println("floatValue2: " + floatValue2);
        System.out.println("doubleValue1: " + doubleValue1);
        System.out.println("doubleValue2: " + doubleValue2);
        System.out.println("booleanValue1: " + booleanValue1);
        System.out.println("booleanValue2: " + booleanValue2);
        System.out.println("charValue1: " + charValue1);
        System.out.println("charValue2: " + charValue2);
        System.out.println("charValue3: " + charValue3);
    }
}
