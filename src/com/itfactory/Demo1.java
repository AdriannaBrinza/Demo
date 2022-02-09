package com.itfactory;

import java.util.Arrays;

public class Demo1 {
    public static void main(String args[]){
        char x = 'B';
        double a = x; // conversie automata?
        System.out.println("Unicode is: " + a);

        char char1='\u0061';
        char char2='\u0041';
        char char3='\u0000';

        System.out.println("char1: "+char1);
        System.out.println("char2: "+char2);
        System.out.println("char3: "+char3);

        //Ex.5 In this example, we increment the provided char value by 1.
        char char4='A';
        char4=(char)(char4+1);

        System.out.println("char: "+char4);

        //Ex.6 Let's see an example to break the string in the form of characters.
        String str="javatpoint";
        char[] ch=str.toCharArray();

        System.out.println("String: "+str);
        System.out.println("char: "+Arrays.toString(ch));
    }
}
