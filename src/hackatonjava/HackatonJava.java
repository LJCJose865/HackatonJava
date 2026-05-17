/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hackatonjava;


/**
 *
 * @author josep
 */

public class HackatonJava {


    //Metodo sin retorno para salundar a una persona.
    public static void saludar(String nombre, int edad) {
        System.out.println("¡Hola " + nombre + "! Tienes " + edad + " años.");
    }
    //Metodo con retorno para obtener un saludo según la hora del día.
    public static String obtenerSaludo(int hora){
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
        saludar(nombre, edad);
        System.out.println(obtenerSaludo(hora));
     }


    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        saludarCompleto( "Jose", 21, 9);
        saludarCompleto("Agie", 17, 13);
        saludarCompleto("Aljandro", 18, 18);
        saludarCompleto("Nicolas", 16, 24);
    }
}
