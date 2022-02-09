package com.itfactory;

public class Primitive3 {
        public static void main(String[] args)
        {
            /*Rezolvati greselile din acest cod
            float x = 3.5d;
            double y = 123141.21112222L;
            double z = y / x.0;
            System.out.println("Impartirea celor doua numere este z");*/

            float x = 3.5f;
            double y = 123141.21112222d;
            double z = y / x;
            double t = (double) y/x;

            System.out.println("Impartirea celor doua numere este: " + z);
            System.out.println("Impartirea celor doua numere este: " + t);
        }
}