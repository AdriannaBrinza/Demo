package com.itfactory;

public class Primitive2 {
    public static void main(String[] args)
    {
    /*  Corectati codul:
        int x = 3.2;
        int y = 5.6f;
        int z = 2.3d;
        double mediaAritmetica = (x+y+z) / 3.0;
        System.out.println("Media aritmetica este: " + mediaAritmetica);*/

        float x = 3.2f;
        float y = 5.6f;
        double z = 2.3d;

        double mediaAritmetica = (x+y+z) / 3.0;
        // sau :
        double mediaAritmetica1 = (x+y+z) / 3;
        //sau :
        double mediaAritmetica2 = (double)(x+y+z) / 3;
        System.out.println("Media aritmetica este: " + mediaAritmetica);
        System.out.println("Media aritmetica 1 este: " + mediaAritmetica1);
        System.out.println("Media aritmetica 2 este: " + mediaAritmetica2);
    }
}