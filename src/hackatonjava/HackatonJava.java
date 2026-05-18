/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hackatonjava;


/**
 * El saludador inteligente es un programa que saluda a las personas de manera personalizada según su nombre, edad y la hora del día.
 * El programa tiene dos métodos principales: saludar() y obtenerSaludo(). El método saludar() recibe el nombre y la edad de la persona y muestra un mensaje de saludo personalizado. 
 * El método obtenerSaludo() recibe la hora del día y devuelve un saludo adecuado (buenos días, buenas tardes o buenas noches).
 * El programa también incluye un método saludarCompleto() que combina ambos métodos para proporcionar un
 * @author josep
 */

public class HackatonJava {


    //------------------------------------------//
    // RETO 01: SALUDADOR INTELIGENTE
    //------------------------------------------//

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
    
    /**
     * Método completo que combina ambos métodos para proporcionar un saludo completo, asi no toca lñlamar individualmente a cada método.
     * @param nombre El nombre de la persona a saludar.
     * @param edad La edad de la persona a saludar.
     * @param hora La hora del día.
     */
    public static void saludarCompleto(String nombre, int edad, int hora){
        saludar(nombre, edad);
        System.out.println(obtenerSaludo(hora));
     }


    public static void main(String[] args) {
        //Enbes de llamar a los métodos por separado, se llama al método completo que incluye ambos métodos.
        saludarCompleto( "Jose", 21, 9);
        saludarCompleto("Agie", 17, 13);
        saludarCompleto("Aljandro", 18, 18);
        //Este es para demostrar el caso de una hora no válida.
        saludarCompleto("Nicolas", 16, 24);
    }
}
