package clases.y.objetos;

public class Mascota {

// herencia
// colocamos los metodos que comparten las clases hermanas en la clase padre Mascota
// y posteriormente hereden de la misma, para poder utilizar los metodos de la clase Mascota
// una vez realizada la herencia las clases hijas podran utilizar todos los metodos y atributos (publicos o privados)
// de la clase hija. Los objetos creados a partir de la clase hija unicamente podran hacer uso de los atributos y metodos publicos
// de la clase padre
// una clase padre podra ser heredada por la N cantidad de clases hijas

String nombre;
String raza;
int edad;

// sobre escritura de metodos o polimorfismo
// habra ocasiones en las que los metodos de la clase padre no satisfagan las necesidades de las clases hijas
// por lo que sera necesario que las clases hijas la implementen de otra manera
// en resumen, una clase hija implementa el metodo de la clase padre pero de distinta manera

void hablar (){
    System.out.println("La mascota se encuentra...");
}

void comer (){  
    System.out.println("La mascota se encuentra comiendo");
}


void dormir (){
    System.out.println("La mascota se ha ido a dormir");
}
 

void establecerParametros (String nombre, String raza, int edad){
    this.nombre = nombre;
    this.raza = raza;
    this.edad = edad;
}
    
// sobre escritura de constructores
// al tener nuestra clase padre un constructor con parametros definido, las clases hijas deberan establecer 
// argumentos al crear objetos.
public Mascota (String nombre, String raza, int edad){
    this.nombre = nombre;
    this.raza = raza;
    this.edad = edad;
}

public Mascota (){  // al agregar un constructor sin parametros, los argumentos seran opcionales lo que nos evita errores
}                   // la sobre escritura tambien sera opcional

}
