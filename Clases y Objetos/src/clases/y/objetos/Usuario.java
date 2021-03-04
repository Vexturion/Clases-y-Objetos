package clases.y.objetos;

public class Usuario {

// modificadores de acceso y encapsulamiento
// el encapsulamiento busca la forma de controlar el acceso a los datos que conforman un objeto
// los modificadores de acceso restringen el acceso y son
// default: cualquier clase u onjeto puede hacer uso, siempre y cuando esten en el mismo paquete
// public: cualquier otro objeto o clase, ya sea del mismo paquete u otro puede acceder    
// private: solo elementos de la misma clase podran hacer uso del atributo

    
public String username;
private String password;

public Usuario (String username, String password){
        this.username = username;
        this.password = password;
    }

// sobre carga de constructores
// realizamos variaciones a nuestro constructor para que pueda recibir menos parametros
// nuestro constructor recibe unicamente el parametro username
public Usuario (String username){
        this.username = username;
        this.password = "";
    }

// nuestro constructor puede no recibir parametro alguno
public Usuario (){
        this.username = "";
        this.password = "";
    }

    void saluda(){
        System.out.println("Hola mi nombre de usuario es " + this.username);
}

    public String getPassword() {
        return this.password;
} // con el metodo getter las demas clases podran acceder/obtener/imprimir al contenido de password

    public void setPassword(String password){
        this.password = password;
}  // con el metodo setter las demas clases podran modificar el valor de password
    
// constructores
// un constructor es similar en estructura a un metodo y su proposito es inicializar una instancia
// tambien puede poseer modificador de acceso
// public Usuario (){  // una vez definido el constructor, se ejecutara automaticamente cuando un objeto sea creado
    //System.out.println("Se ha creado un nuevo objeto de tipo usuario");}

 // Clases anidadas
 // en ocasiones necesitaremos que nuestras clases posean subclases o roles

public void establecerRol(){
    Administrador Admin = new Administrador();
    Admin.trabajar();  // una vez creada nuestra sub clase la clase principal podra hacer uso de los metodos de las clases anidadas
                       // y viceversa
}
    
public class Administrador{  // esta es nuestra clase anidada, podra ser usada por la clase principal y su trato es similiar al de las clases normales
    public void trabajar(){
        System.out.println("El administrador " + /*this.*/username + " se encuentra trabajando");
    }    // si colocamos this saltara un error puesto que this hara referencia a la clase donde se invoca 



}















}