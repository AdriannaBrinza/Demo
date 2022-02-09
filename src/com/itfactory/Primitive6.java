package com.itfactory;
/***
 * Creati un program simplu in care sa calculati si sa afisati aria unui dreptunghi.
 * Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Aria dreptunghiului este: " + arieDreptunghi);
 *
 * Ce este aria unui dreptunghi?
 *** Este produsul lungimii si al latimii
 */
public class Primitive6 {
public static void main(String args[])
    {
    double lungime = 13.56234178d;
    double latime = 10.5d;

    double arieDreptunghi = lungime*latime;

    System.out.println("Aria dreptunghiului este: " + arieDreptunghi);
    }
}
