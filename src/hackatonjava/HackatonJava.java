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

    //menu para llamar las funciones por separado
    public static void menu(){
        System.out.println("Elija una opción:");
        System.out.println("1. Saludar");
        System.out.println("2. Obtener saludo");
        System.out.println("3. Saludar completo");
        try (Scanner sc = new Scanner(System.in)) {
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    saludar("Jose", 21);
                    break;
                case 2:
                    String obtenerHora = obtenerSaludo(0);
                    System.out.println(obtenerHora);
                    break;
                case 3:
                    saludarCompleto("Maria", 30, 0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    //Metodo sin retorno para salundar a una persona.
    public static void saludar(String nombre, int edad) {
        System.out.println("¡Hola " + nombre + "! Tienes " + edad + " años.");
    }
    //Metodo con retorno para obtener un saludo según la hora del día.
    public static String obtenerSaludo(int hora){
        //Solicitar al usuario que ingrese la hora del día
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingresa la hora del día (0:am -23:pm): ");
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
     public static void saludarCompleto(String nombre, int edad, int hora){
        //llamando al metodo void 
        saludar(nombre, edad);
    
        //Llamando al metodo con retorno para conbinarlo en la función
        String saludo = obtenerSaludo(hora);
        System.out.println(saludo);
     }


    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        //llamada del metodo saludar para saludar a una persona con su nombre y edad. sin retorno
       saludar("Jose", 21);

       //llamada del metodo obtenerSaludo para obtener un saludo según la hora del día. con retorno
      /*String obtenerHora = obtenerSaludo(0);
         System.out.println(obtenerHora);*/
       
       //llamado al metodo saludar completo
         saludarCompleto("Maria", 30, 0);  

    }
}
