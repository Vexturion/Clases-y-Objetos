package clases.y.objetos;

public class Calculadora {

// sobre carga de metodos
// es la posibilidad que tiene un lenguaje de programacion de definir dos o mas metodos con el mismo nombre
// en la misma clase para tener distintos comportamientos
    
public int suma (int valor1, int valor2){
    return valor1 + valor2;
}
// nuestro metodo suma es efectivo para sumar numeros enteros pero inutil si los valores son de otros tipos
public int suma (int valor1, double valor2){
    return valor1 + (int) valor2;
}
// ahora nuestro metodo suma es capaz de sumar un valor decimal y un valor entero

public double suma (double valor1, double valor2){
    return valor1 + valor2;
}
// ahora nuestro metodo suma es capaz de sumar dos valores decimales

// multiples parametros
public int suma (int... valores){ // con esta estructura le indicamos al metodo que puede recibir n cantidad
    int suma = 0;                 // de variables de tipo int
    for (int numero: valores)   // nuestro parametro es tambien un arreglo, usamos un ciclo foreach para sumar los valores
        suma+=numero;
        return suma;
    }







}
