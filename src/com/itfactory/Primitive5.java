package com.itfactory;
/***
 * Creati un program simplu in care sa calculati si sa afisati perimetrul unui triunghi
 *  Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);
 *
 * Ce este perimetrul unui triunghi?
 *** Este suma lungimilor laturilor
 */
public class Primitive5 {
    public static void main(String[] args)
    {
        int latura1 = 15;
        float latura2 = 12.5f;
        float latura3 = 13.5f;

        float perimetru1 = (latura1+latura2+latura3);
        float perimetru2 = (float) (latura1+latura2+latura3);

        System.out.println("1.Perimetrul triunghiului este: " + perimetru1);
        System.out.println("2.Perimetrul triunghiului este: " + perimetru2);
    }
}
