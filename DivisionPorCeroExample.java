/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisionporceroexample;

/**
 *
 * @author Usuario
 */
public class DivisionPorCeroExample {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;
        try {
          
            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
         
            System.out.println("Error: División por cero. No se puede dividir un número por cero.");
          
        } finally {
         
            System.out.println("Programa terminado.");
        }
    }
}

