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
    private static Scanner scanner;

    //Metodo sin retorno para salundar a una persona.
    public static void saludar(String nombre, int edad) {
        System.out.println("¡Hola " + nombre + "! Tienes " + edad + " años.");
    }
    //Metodo con retorno para obtener un saludo según la hora del día.
    public static String obtenerSaludo(int hora){
        //Solicitar al usuario que ingrese la hora del día
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingresa la hora del día (0-23): ");
            hora = sc.nextInt();
        }
        //funcion if else para determinar el saludo según la hora del día
        if (hora >= 0 && hora <= 11){
            return "¡Buenos días!";
        }else if (hora >= 12 && hora <= 17){
            return "¡Buenas tardes!";
        }else if (hora >= 18 && hora <= 23){
            return "¡Buenas noches!";
        }
        //por si el usuario ingresa una hora no válida, se le indicará que la hora no es válida.
        return "Hora no válida.";
    }

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        //llamada del metodo saludar para saludar a una persona con su nombre y edad. sin retorno
       saludar("Jose", 21);

       //llamada del metodo obtenerSaludo para obtener un saludo según la hora del día. con retorno
       String obtenerHora = obtenerSaludo(0);
         System.out.println(obtenerHora);
       
    
    }
}
