package hackatonjava;

public class HackatonJava4 {
    //-------------------------------------------//
    //      ORDENADOR Y BUSCADOR RETO 04
    //-------------------------------------------//

    // Método para ordenar un array de enteros utilizando el algoritmo de ordenamiento por burbuja.
    public static void intercambiar(int[] arr, int i, int j) {
        // Intercambia los elementos en las posiciones i y j del array.
        int temporal = arr[i];
        arr[i] = arr[j];
        arr[j] = temporal;//Utilizamos una variable temporal para almacenar el valor de array[i] mientras realizamos el intercambio.
    }
    /*  Funcion auxiliar
    se usa para mostrar los elementos de un array en una línea */
    public static void mostarArray(int[] arr) {
        // Recorre el array y muestra cada elemento seguido de un espacio.
        for (int numero : arr) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Imprime una nueva línea después de mostrar el array. 
    }

        //Aquí voy a crear una funcion de prueba para mostrar el funcionamiento del método, antes y despues del intercambio.
    public static void pruebaIntercambio() {
        int[] numeros = {51, 23, 18, 61, 20};
        System.out.println("Array antes del intercambio:");
        mostarArray(numeros);
        intercambiar(numeros, 0, 4); // Intercambia el primer y el cuarto elemento
        System.out.println("Array después del intercambio:");
        //el mostrarArray es un método que se encarga de imprimir los elementos del array en la consola, para verificar el resultado del intercambio.
        mostarArray(numeros);
    }
    
    public static void main(String[] args) {
        //Con solo este método se puede probar el funcionamiento del método de intercambio.
        pruebaIntercambio();
    }
}

