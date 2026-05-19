package hackatonjava;
public class HackatonJava4 {
    //-------------------------------------------//
    //      ORDENADOR Y BUSCADOR RETO 04
    //-------------------------------------------//

    //-----------------------//
    //      Intercambio     //
    //-----------------------//

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


    //Metodo ordenamiento burbuja para ordenar los enteros de una lista de menor a mayor

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


    //Creación de metodo par buscar el indice de  un objeto en una lista de enteros (usando busqueda lineal)
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

    //-----------------------//
    //    Busqueda Binaria  //
    //-----------------------//

    //Sin miedo al exito despues de 15 tutoriales, y un monton de errores algo tendra que salir :V todo o nada :v :) ATT: LJC865P
    public static int busquedaBinaria(int[] arr, int objetivo){
        //lamamos al metodo bubbleSort para ordenar el array antes de realizar la búsqueda binaria, ya que este algoritmo requiere que el array esté ordenado.
        bubbleSort(arr);

        int inicioIndice = 0; // Inicializamos el índice de inicio del array (Lista).
        int finIndice = arr.length - 1; // Inicializamos el índice de fin del array.

        while (inicioIndice <= finIndice){ //Segun inicioIndice sea menor o igual a finIndice ejecutamos el ciclo.
            int medioIndice = (inicioIndice + finIndice) / 2;//Esta linea es para calcular el indice del elemento medio de nuestra array.
            if(arr[medioIndice] == objetivo){//Si medioIndice es igual al objetivo, hemos encontrado el objetivo y devolvemos su índice.
                return medioIndice;
            }else if (arr[medioIndice] < objetivo){//Si el elemento en medioIndice es menor que el objetivo, entonces el objetivo se encuentra en la mitad superior del array.
                inicioIndice = medioIndice + 1; //osea se busca en la mitad de la derecha o superior.
            }else{
                finIndice = medioIndice -1; //Para buscar en la mitad izquiera o inferior.
            }
            
        }
        return -1; // Si el objetivo no se encuentra, se devuelve -1.
    }

    //Función de prueba para el método de búsqueda binaria
    public static void probandoBusquedaBinaria(){
        int [] numeros = {12, 5, 8, 13, 7, 11, 9, 10, 6, 4}; // Creamos un array de enteros para probar la búsqueda binaria.
        System.out.println("\n****Busqueda binaria****");
        System.out.print("Lista original: ");
        mostarArray(numeros); // Mostramos el array original antes de ordenar.
        System.out.println();
        //Mostramos el array ordenado para verificar que el método de ordenamiento burbuja funciona correctamente antes de realizar la búsqueda binaria.
        System.out.print("Lista ordenada: ");
        bubbleSort(numeros);
        mostarArray(numeros);
        System.out.println();
        
        // Llama al método de búsqueda binaria para buscar el índice del número 10 en el array.
        int indiceDeNum1 = busquedaBinaria(numeros, 10); // Llama al método de búsqueda binaria para buscar el índice del número 10 en el array.
        int indiceDeNum2 = busquedaBinaria(numeros, 15); //este es para observar que pasa cuando se pide buscar un objeto que no esta dentro de la lista.

        System.out.println("El indice del numero 10 es el " + "(" + indiceDeNum1 + ")");
        System.out.println("El indice del numero 15 es el " + "(" + indiceDeNum2 + ")");
    }


    //-----------------------//
    //   Mostrar ARRAY      //
    //-----------------------//

    /*Nota: yo ya tenia un metodo mostrar array mas simplificado para mostrar las pruebas de funcionameinto de los metodos anteriores,
     decidi crear este para que cumpla los requisitos del reto ademas de que trate de moverle al anterior debido a que me generaba errores en el codigo,
     asi que aplique la de "si no esta roto, no lo arregles xd dddd" y viendo tutoriales observve que podia sobre cargar esa rama.
    */
   public static void mostrarArray(int[] arr, String etiqueta){
    //Recoremos el array y mostramos cada elemento con una etiqueta para identificarlo.
    System.out.print(etiqueta + ": [");
    for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i]);
        if(i < arr.length - 1){
            System.out.print(", ");
        }
    }
    System.out.println("]");
   }   


   //--------------------------------//
   //    Mostrar Reto Completo       //
   //--------------------------------//

//Para mostrar que el reto si funciona

public static void probarRetoCompleto(){
    int[] numeros ={11, 13, 19, 15, 10, 12, 14,};
 System.out.println("\n ********Prueba del Reto 04********");
 mostrarArray(numeros, "Arreglo original");
bubbleSort(numeros);
mostrarArray(numeros, "Arreglo ordenado");

int objetivo = 19;
int indice = busquedaBinaria(numeros, objetivo);

System.out.println("El indice del numero" + objetivo + ": es el: " + indice);

}
    
    public static void main(String[] args) {
        //Con solo este método se puede probar el funcionamiento del método de intercambio.
        pruebaIntercambio();
        //Con este método se puede probar el funcionamiento del método de ordenamiento burbuja.
        probarBubbleSort();

        //Con solo esta linea de codigo en el main se puede probar el funcionamiento del método de búsqueda lineal.
        probarBusquedaLineal();
        //Con solo esta linea de codigo en el main se puede probar el funcionamiento del método de búsqueda binaria.
        probandoBusquedaBinaria();

        //--------------------------------//
        //        Prueba Reto 04         //
        //------------------------------//
        probarRetoCompleto();

    }
}

