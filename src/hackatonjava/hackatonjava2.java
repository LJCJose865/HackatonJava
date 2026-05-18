package hackatonjava;
import java.util.Scanner;

public class hackatonjava2 {

    static Scanner sc = new Scanner(System.in);         /*Estas variables van a ser globales para utilizarlas
                                                        en los metodos que las necesiten */
    static String[] nombres = new String[100];

    static double[][] notas = new double[100][10];

    static int cantidadEstudiantes;

    static int cantidadNotas;

    public static void ingresarDatos() {        /*cree este metodo para ingresar los datos de los estudiantes y sus notas
                                                asi facilitando un poco todo el proceso por mas que no lo pidiera el ejercicio*/
        System.out.print("¿Cuántos estudiantes desea ingresar?: ");
        cantidadEstudiantes = sc.nextInt();

        System.out.print("¿Cuántas notas tendrá cada estudiante?: ");
        cantidadNotas = sc.nextInt();

        for (int i = 0; i < cantidadEstudiantes; i++) {

            System.out.println("\nEstudiante #" + (i + 1));

            System.out.print("Nombre: ");
            nombres[i] = sc.next();

            for (int j = 0; j < cantidadNotas; j++) {

                double nota;

                do {

                    System.out.print("Ingrese la nota #" + (j + 1) + " (0-10): ");
                    nota = sc.nextDouble();

                    if (nota < 0 || nota > 10) { 

                        System.out.println("La nota debe estar entre 0 y 10.");
                    }

                } while (nota < 0 || nota > 10);

                notas[i][j] = nota;
            }
        }
    }

    public static double calcularPromedio(int estudiante) {     //primer punto, hace el promedio de cada estudiante

        double suma = 0;

        for (int j = 0; j < cantidadNotas; j++) {

            suma = suma + notas[estudiante][j];
        }

        return suma / cantidadNotas;
    }

    public static void mostrarPromedios() {

        System.out.println("\nPromedios");

        for (int i = 0; i < cantidadEstudiantes; i++) {

            System.out.println(
                    nombres[i] + ": " +
                    calcularPromedio(i)
            );
        }
    }

    public static double buscarMayor() {            /*segundo punto, busca la mayor nota entre todos los estudiantes
                                                    (solo las notas ingresadas no la nota promedio)*/
        double mayor = notas[0][0];

        for (int i = 0; i < cantidadEstudiantes; i++) {

            for (int j = 0; j < cantidadNotas; j++) {

                if (notas[i][j] > mayor) {

                    mayor = notas[i][j];
                }
            }
        }

        return mayor;
    }

    public static double buscarMenor() {        //tercer punto, realiza lo mismo que el segundo pero para la menor nota

        double menor = notas[0][0];

        for (int i = 0; i < cantidadEstudiantes; i++) {

            for (int j = 0; j < cantidadNotas; j++) {

                if (notas[i][j] < menor) {

                    menor = notas[i][j];
                }
            }
        }

        return menor;
    }

    public static int contarAprobados(double notaMinima) {      /*cuarto punto, cuenta la cantidad de estudiantes aprobados
                                                                */
        int aprobados = 0;

        for (int i = 0; i < cantidadEstudiantes; i++) {

            if (calcularPromedio(i) >= notaMinima) {

                aprobados++;
            }
        }

        return aprobados;
    }

    public static void mostrarReporte(double notaMinima) {      //quinto punto, reporte de los estudiantes y la tabla

        System.out.println("\nNombre\t\tPromedio\tEstado");

        for (int i = 0; i < cantidadEstudiantes; i++) {

            double promedio = calcularPromedio(i);

            String estado;

            if (promedio >= notaMinima) {

                estado = "Aprobado";

            } else {

                estado = "Reprobado";
            }

            System.out.println(
                    nombres[i] + "\t\t" +               // esto para crear espacios y que la tabla se vea mejor
                    promedio + "\t\t" +
                    estado
            );
        }
    }

    public static void mostrarMayor() {

        System.out.println("\nNota mayor: " + buscarMayor());
    }

    public static void mostrarMenor() {

        System.out.println("Nota menor: " + buscarMenor());
    }                                                           /*utilice estos metodos para que en el main unicamente
                                                                se haga el llamado de las funciones */
    public static void mostrarAprobados() {

        System.out.println(
                "Cantidad de aprobados: " +
                contarAprobados(5.5)
        );
    }

    public static void main(String[] args) {        //solo llamado de los metodos
        ingresarDatos();
        mostrarPromedios();
        mostrarMayor();
        mostrarMenor();
        mostrarAprobados();
        mostrarReporte(5.5);
    }
}