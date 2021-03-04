package clases.y.objetos;

public class Perro extends Mascota {

/*String nombre;  // asi definimos atributos para nuestro objeto
String raza;
int edad;

void comer (){  // la palabra void hara que nuestro metodo no retorne ningun valor
    System.out.println("El perro se encuentra comiendo");  // esta es la estructura que utilizaremos para crear metodos
}
*/
    
@Override // dado que gatos y perros hacen cosas distintas al "hablar" el metodo debe realizar distintas acciones
void hablar (){
    System.out.println(this.nombre + " se ha ido a ladrar");
}
    
/*
void dormir (){
    System.out.println("El perro se ha ido a dormir");
}
 
// crea,os un metodo para pdoer asignar parametros
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

public Perro (String nombre, String raza, int edad){
    super (nombre, raza, edad);
}

public Perro(){
    super ();
}




}
