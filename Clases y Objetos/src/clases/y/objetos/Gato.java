package clases.y.objetos;
/*

String nombre;  // asi definimos atributos para nuestro objeto
String raza;
int edad;

void comer (){  // la palabra void hara que nuestro metodo no retorne ningun valor
    System.out.println("El perro se encuentra comiendo");  // esta es la estructura que utilizaremos para crear metodos
}

void ladrar (){
    System.out.println("El perro se ha ido a ladrar");
}
    
void dormir (){
    System.out.println("El perro se ha ido a dormir");
}
 
// creamos un metodo para poderer asignar parametros
/*void establecerParametros (String nombrePerro, String razaPerro, int edadPerro){
    nombre = nombrePerro;
    raza = razaPerro;
    edad = edadPerro;
} 

// this
// con this podemos asignar valores como en el metodo anterior sin la necesidad de ser tan redundante
void establecerParametros (String nombre, String raza, int edad){
    this.nombre = nombre;
    this.raza = raza;
    this.edad = edad;
}

*/

// herencia
// como podemos apreciar, nuestra clase Gato posee practicamente el mismo codigo que nuestra clase perro
//   por lo que seria mas sencillo crear una clase "Mascota" de la cual ambas clases hereden
//   la herencia nos permite crear nuevas clases a partir de otras


public class Gato extends Mascota {  // utilizamos la palabra reservada extends para indicar que la clase A hereda de la clase B

// sobre escritura de metodos o polimorfismo
@Override  // al modificar el comportamiento de una clase colocaremos encima @Override
public void hablar () {  // tomamos el metodo de la clase padre y modificamos su comportamiento
    System.out.println(this.nombre + " se encuentra maullando");
    }    

// super
// si queremos modificar el metodo de la clase padre pero sin perder todas las funciones que la clase padre ya provee
// super nos permite sobre escribir metodos pero sin perder las funciones de la clase padre
@Override
void dormir (){
    super.dormir(); // escribir super. y el metodo a usar (super -> clase padre) 
    System.out.println(this.nombre + " se ha ido a dormir");
}

// Sobre escritura de constructores
public Gato (String nombre, String raza, int edad){
    super (nombre, raza, edad); // colocamos los argumentos para los parametros, que son los mismos que recibe el constructor
    // al ejecutarse el constructor de la clase hija este ejecuta el de la clase padre, que asigna valores a los atributos
    //this.nombre;
    //this.raza;
    //this.edad; al tener estos parametros se entrara en conflicto con el constructor de la clase mascota, puesto que
    // la clase padre ya cuenta con un constructor con parametros
}

public Gato(){
    super ();
}






}
