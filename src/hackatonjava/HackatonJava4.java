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
        System.out.println("\nArray antes del intercambio:");
        mostarArray(numeros);
        intercambiar(numeros, 0, 4); // Intercambia el primer y el cuarto elemento
        System.out.println("\nArray después del intercambio:");
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
        System.out.println("\nLista antes de ordenar:");
        mostarArray(numeros);
        bubbleSort(numeros); // Llama al método de ordenamiento burbuja para ordenar el array.
        System.out.println("\nLista después de ordenar:");
        mostarArray(numeros);
    }

    //-----------------------//
    //   Busqueda Lineal    //
    //----------------------//

    //Creación de metodo par buscar el indice de  un obbjeto en una lista de enteros (usando busqueda lineal)
    public static int busquedaLineal(int [] arr, int objeto){
        //Toca crear un ciclo for para recorrer cada elemento de la lista
        //hasta encontrar el objeto o llegar al final de la lista, con la finalidad de obtener el indice del objeto.
        for(int i = 0; i < arr.length; i++){//dice que, entero i igual a cero, mientras i sea menor que la longitud del array, incrementa i en uno, que no se te olvide
            if (arr[i] == objeto){ //Si el elemento actual es igual al objeto que estamos buscando, se devuelve el índice del elemento.
                return i;
            }
        }
        return -1; // Si el objeto no se encuentra, se devuelve (-1).
    }

    //Prueba del método de búsqueda lineal
    public static void probarBusquedaLineal(){
        int[] numeros = {10, 20, 30, 40, 50, 15, 25}; // Creamos un array de enteros para probar la búsqueda lineal.
        System.out.println("\nPrueba busqueda lineal");
        int indiceDe1 = busquedaLineal(numeros, 15); // Llama al método de búsqueda lineal para buscar el índice del número 15 en el array.
        int indiceDe2 = busquedaLineal(numeros, 29); //este es para observar que pasa cuando se pide buscar un objeto que no esta dentro de la lista.

        System.out.println("El indice del numero 15 es el " + "(" +indiceDe1 + ")");//Imprime el índice del número 15 encontrado en la lista.
        System.out.println("El indice del numero 29 es el " + "(" + indiceDe2 + ")");//Como el numero 29 no se encuentra en la lista, esta no encuetra su indice asi que devuelve -1.
    }
    
    public static void main(String[] args) {
        //Con solo este método se puede probar el funcionamiento del método de intercambio.
        pruebaIntercambio();
        //Con este método se puede probar el funcionamiento del método de ordenamiento burbuja.
        probarBubbleSort();
        //Con solo esta linea de codigo en el main se puede probar el funcionamiento del método de búsqueda lineal.
        probarBusquedaLineal();
    }
}

