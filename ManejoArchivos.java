/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.manejoarchivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManejoArchivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo:");
        String nombreArchivo = scanner.nextLine();
        
        try {
            leerArchivo(nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró en el sistema.");
        }
    }
    
    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        Scanner lector;
        try {
            lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró en el sistema.");
        }
    }
}
