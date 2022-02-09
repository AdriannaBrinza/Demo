package com.itfactory;

public class Repair3 {
    public static void main(String args[]){
        int x = 9321;
        long y = 9456873L;

        long suma = x+y;
        long diferenta=y-x;
        long inmultire=x*y;
        float impartire= (float) y/x;

        System.out.println("Suma numerelor este: " + suma);
        System.out.println("Diferenta numerelor este: " + diferenta);
        System.out.println("Inmultirea numerelor este: " + inmultire);
        System.out.println("Rezultatul impartirii este: " + impartire);
    }
}
