/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author kejl
 */
public class Main {
    public static void main(String[] args)
    {
        Persona p1 = new Persona("Laura");
        Persona p2 = new Persona("Diego");
        Persona p3 = new Persona("Luis");
        
        p1.start();
        p2.start();
        p3.start();
    }
}
