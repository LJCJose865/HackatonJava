package hackatonjava;
import java.util.Scanner;

public class hackatonjava2 {

    
    public static double calcularPromedio() {

        Scanner sc = new Scanner(System.in);

        int[] notas = new int[100];
        int cantidad = 0;
        int suma = 0;

        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {

           System.out.print("Ingrese una nota (0-100): ");
            int nota = sc.nextInt();

            if (nota >= 0 && nota <= 100) {

                notas[cantidad] = nota;

                suma = suma + nota;

                cantidad++;

            } else {

                System.out.println("Nota inválida. Debe estar entre 0 y 100.");

            }

            System.out.print("¿Desea ingresar otra nota? (si/no): ");
            continuar = sc.next();
        }

        return (double) suma / cantidad;
    }

    public static void main(String[] args) {

        System.out.println("El promedio es: " + calcularPromedio());
    }
    
}