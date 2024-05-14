/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demoexcepciones;

class ExcepcionA extends Exception {
    public ExcepcionA(String message) {
        super(message);
    }
}

class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String message) {
        super(message);
    }
}

class ExcepcionC extends ExcepcionB {
    public ExcepcionC(String message) {
        super(message);
    }
}

public class DemoExcepciones {
    public static void main(String[] args) {
        try {
            throw new ExcepcionC("Este es un mensaje de excepcion de tipo Excepcion C");
        } catch (ExcepcionA e) {
            System.out.println("Se ha capturado una excepcion de tipo Excepcion A: " + e.getMessage());
        }
    }
}
