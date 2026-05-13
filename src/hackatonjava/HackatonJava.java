/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hackatonjava;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class HackatonJava {
    //Metodo sin retorno para salundar a una persona.
    public static void saludar(String nombre, int edad) {
        System.out.println("¡Hola " + nombre + "! Tienes " + edad + " años.");
    }

    public static String obtenerSaludo(int hora){
        if (hora >= 0 && hora <= 11){
            return "¡Buenos días!";
        }else if (hora >= 12 && hora <= 17){
            return "¡Buenas tardes!";
        }else if (hora >= 18 && hora <= 23){
            return "¡Buenas noches!";
        }
        return "Hora no válida.";
    }

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
       saludar("Jose", 21);
       
       System.out.println("Ingresa la hora del día (0-23): ");
       try (Scanner scanner = new Scanner(System.in)) {
        int hora = scanner.nextInt();
           System.out.println(obtenerSaludo(hora));
    }
    }
}
