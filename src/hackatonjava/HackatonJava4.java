package hackatonjava;

public class HackatonJava4 {
    //-------------------------------------------//
    //      ORDENADOR Y BUSCADOR RETO 04
    //-------------------------------------------//

    //-----------------------//
    //      Intercambio     //
    //-----------------------//
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

    //----------------------//
    //      BubbleSort     //
    //--------------------//

    //Metodo ordenamiento burbuja para ordenar los enteros de una lisde de menor a mayor
    public  static void bubbleSort(int[] arr){
        int num = arr.length; /*Para optener la longitud de array*/
        //esta funciion compara cada elemento de la listacon el siguiente y los intercambia si estan en orden incorrecto, hasta que la lista este ordenada.
        for (int i = 0; i < num - 1; i++){
            //Este es el bucle que se encarga de comparar cada elemento con el siguiente.
            for (int j = 0; j < num - i - 1; j++){
                if (arr[j] > arr[j + 1]){ /*Si el elemento actual es mayor que el siguiente, se realiza el intercambio*/
                    intercambiar(arr, j, j + 1);//Llamamos al método de intercambio para realizar el intercambio de los elementos.
                }
            }
        }

    }

    //Prueba del método de ordenamiento burbuja
    public static void probarBubbleSort(){
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Lista antes de ordenar:");
        mostarArray(numeros);
        bubbleSort(numeros); // Llama al método de ordenamiento burbuja para ordenar el array.
        System.out.println("Lista después de ordenar:");
        mostarArray(numeros);
    }

    //-----------------------//
    //   Busqueda Lineal    //
    //----------------------//
    
    public static void main(String[] args) {
        //Con solo este método se puede probar el funcionamiento del método de intercambio.
        pruebaIntercambio();
        //Con este método se puede probar el funcionamiento del método de ordenamiento burbuja.
        probarBubbleSort();
    }
}

