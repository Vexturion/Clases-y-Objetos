package clases.y.objetos;

public class Circulo extends Figura {

// static: al usar static nosotros podemos usar el atributo sin la necesidad de crear un objeto de la clase circulo
public static final float pi= 3.1415926535f;  // al usar final convertimos la variable en una constante
public float radio = 0f; // al hacer un atributo estatico este pertenecera a la clase y no al objeto

public Circulo (float radio){  // constructor
    this.radio = radio;  // el atributo radio es un atributo de instancia puesto que le pertenece al objeto
}
@Override
public float area (){  // metodo de instancia
    return Circulo.pi*(radio*radio);  // es buena practoca poner la clase a la cual pertenece un atributo o metodo estatico
}


// metodo estatico
public static float area (float radio) { //al ser radio un atributo de instancia tendremos un error puesto que 
return Circulo.pi*(radio*radio); // no podemos usar atributos o metodos que le pertenezcan a un objeto en un metodo statico
}  // modificamos el metodo para que reciba directamente el valor del radio, lo que nos permite utilizar el metodo sin la
// necesidad de crear un nuevo objeto de tipo circulo, unicamente insertamos el valor de su radio y podremos obtener su area
public Circulo (){
    
}
 








}

