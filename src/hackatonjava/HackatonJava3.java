package hackatonjava;

import java.util.Scanner;
public class HackatonJava3 {
 
  public static void main(String[] args) {
        //El método main() sólo llama funciones, sin lógica directa
       validarContrasena();
    }
    
    public static void validarContrasena () {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("=== VALIDADOR DE CONTRASEÑAS INTERACTIVO ===");
            System.out.print("Por favor, escribe la contraseña que quieres evaluar: ");
            
            
            String contrasenaUsuario = teclado.nextLine(); 
            
      
            String resultado = evaluarContrasena(contrasenaUsuario);
            
            System.out.println("\n--- RESULTADO DE LA EVALUACIÓN ---");
            System.out.println("Tu contraseña es: " + contrasenaUsuario);
            System.out.println("Nivel de seguridad: " + resultado);
        }
        
       
    }
 // =========================================================================
    // RETO 03: VALIDADOR DE CONTRASEÑAS
    // =========================================================================

    // Tarea 1: Verifica la longitud mínima requerida 
    public static boolean tieneLongitudMinima(String pass, int min) {
        return pass.length() >= min;
    }

    // Tarea 2: Retorna true si contiene al menos una letra mayúscula
    public static boolean tieneMayuscula(String pass) {
        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Tarea 3: Retorna true si contiene al menos una letra minúscula
    public static boolean tieneMinuscula(String pass) {
        for (char c : pass.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Tarea 4: Retorna true si contiene al menos un número
    public static boolean tieneDigito(String pass) {
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Tarea 5: Verifica caracteres especiales 
    public static boolean tieneCaracterEspecial(String pass) {
        String especiales = "!@#$%&*";
        for (char c : pass.toCharArray()) {
            if (especiales.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    // Tarea 6: Evalúa la contraseña combinando los métodos anteriores
    public static String evaluarContrasena(String pass) {
        boolean largoOK = tieneLongitudMinima(pass, 8);

        int reglas = 0;
        if (tieneMayuscula(pass)) { reglas++; }
        if (tieneMinuscula(pass)) { reglas++; }
        if (tieneDigito(pass)) { reglas++; }
        if (tieneCaracterEspecial(pass)) { reglas++; }

        if (largoOK && reglas == 4) {
            return "Fuerte";
        } else if (largoOK && reglas >= 2) {
            return "Media";
        } else if (largoOK) {
            return "Debil";
        } else {
            return "No cumple longitud minima";
        }
    } 

    // Tarea 7: Caso de prueba automatica de validacion de contraseñas
    /*public static void probarReto3() {
        System.out.println("--- PRUEBA AUTOMATICA DE VALIDACION DE CONTRASENA ---");
        System.out.println("Probando 'password': " + evaluarContrasena("password"));
        System.out.println("Probando 'Password123': " + evaluarContrasena("Password123"));
        System.out.println("Probando 'Pass123!': " + evaluarContrasena("Pass123!"));
        System.out.println("Probando 'corta': " + evaluarContrasena("corta"));
        System.out.println("Probando 'danielortiz': " + evaluarContrasena("solominusculas"));*/
    }


    
  
       
    
