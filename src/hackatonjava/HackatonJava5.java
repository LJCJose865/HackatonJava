/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hackatonjava;

/**
 *
 * @author LJC865P
 * @author Katalina04
 */
public class Hackatonjava5 {
// ----------------------------------------//
// SISTEMA DE INVENTARIO MODULAR RETO 05  //
//----------------------------------------//

public static void main(String[] args) {
    
//Tarea 1:Declarando en el main los productos y los precios
String[] productos = {"Laptop","Mouse","Teclado","Monitor","Audífonos"};
int[] precios = {2500000,45000,120000,890000,200000};
   probarInventario(productos, precios);
}

  //Tarea 2:Mostrar tabla del inventario
public static void mostrarInventario(String[] productos, int[] precios){
    System.out.println("===INVENTARIO===");
    for (int i = 0; i < productos.length; i++){
        System.out.println((i + 1) + "." + productos[i] + "-$" + precios[i]);
    }
}

//Tarea 3:Calcular valor total retornar la suma de todos los precios
public static double calcularValorTotal(int[]precios){
    double suma = 0;
    for (int i = 0; i < precios.length; i++){
        suma += precios[i];
    }
    return suma;
}

//Tarea 4:Buscar productos retornando el índice del producto
public static int buscarProducto(String[] productos, String nombre){
    for (int i = 0; i < productos.length; i++){
        if (productos[i].equalsIgnoreCase(nombre)){
            return i;
        }
    }
    return -1;
}

//Tarea 5:Hallar producto mas caro y retornar su nombre 
public static String productoMasCaro(String[] productos, int[] precios){
    int mayor = precios[0];
    int posicion = 0;
    
    for (int i = 1; i < precios.length; i++){
        if (precios[i] > mayor){
            mayor = precios[i];
            posicion = i;
        }
    }
    return productos[posicion];
}

//Tarea 6:Filtrar por precio utilizando bucles y retornar un nuevo array
public static int[] filtrarPorPrecio(int[] precios, int maximo){
   int contador = 0;
   
   //bucle para contar cuantos cumplen la condicion
   for (int i = 0; i < precios.length; i++){
       if (precios[i] <= maximo){
           contador++;
       }
   }
   
   int[] resultado = new int[contador];
   int indice = 0;
   
   //bucle para guardar los valores 
   for (int i = 0; i < precios.length; i++){
       if (precios[i] <= maximo){
           resultado[indice] = precios[i];
           indice++;
       }
   }
   return resultado;
}

//Tarea 7:Calcular descuento modificando el array original
public static void aplicarDescuento(int[] precios, double porcentaje){
    for (int i = 0; i < precios.length; i++){
        precios[i] -= precios[i] * porcentaje / 100;
    }
}

//Tarea 8:Probar inventario
public static void probarInventario(String[] productos, int[] precios){
    //1 mostrar inventario
    mostrarInventario(productos, precios);
    //2 calcular total
    double total = calcularValorTotal(precios);
    System.out.println("Valor total: $" + total);
    
    //3 buscar productos
    int posicion = buscarProducto(productos, "Mouse");
    if (posicion != -1){
        System.out.println("Producto encontrado en la posicion: " + posicion);
    }
    
    //4 encontrar el más caro
    String caro = productoMasCaro(productos, precios);
    System.out.println("Producto más caro: " + caro);
        
    //5 filtrar precios
    int[] filtrados = filtrarPorPrecio(precios, 200000);
    System.out.println("Productos menores a 200000: ");
    //bucle para recorrer los filtrados
    for (int i = 0; i < filtrados.length; i++){
        System.out.println(filtrados[i]);
    }
    
    //6 aplicar descuento
    aplicarDescuento(precios, 10);
    System.out.println("Inventario con descuento:");
    
    //7 mostrar los resultados finales 
    mostrarInventario(productos, precios);
}
}