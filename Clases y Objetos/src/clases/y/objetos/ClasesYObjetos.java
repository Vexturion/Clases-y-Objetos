package clases.y.objetos;

public class ClasesYObjetos {
    public static void main(String[] args) {

    // un objeto es una entidad que posee caracteristicas y puede realizar distintas acciones
    // las acciones que puede realizar un objeto se llaman metodos
    // una clase es un molde, algo abstracto que nos permite crear objetos a partir de ciertos atributos
    // a la creacion de un metodo lo llamaremos instancia
    
    // creamos la clase "perro"
    Perro Mofi = new Perro();  // instancia
    
    Mofi.nombre = "Mofi";
    Mofi.raza = "Chihuahua";
    Mofi.edad = 1;
    
    System.out.println("El nombre del perrito es " + Mofi.nombre);  //asi accedemos al atributo nombre de nuestro objeto (objeto.atributo)
    System.out.println("La raza de " + Mofi.nombre + " es " + Mofi.raza);
    System.out.println("La edad de " + Mofi.nombre + " es de " + Mofi.edad + " año(s)");
    
    // metodos
    Mofi.comer(); // de esta forma nosotros utilizamos un metodo
    Mofi.hablar();
    Mofi.dormir();
    
    // los metodos requeriran de valores de entrada para su uso, dichos valores se llaman paramametros
    // creamos un metodo que nos permite asignar valores a nuestros objetos
    Perro Abogado = new Perro();
    Abogado.establecerParametros("Abogado", "Mestizo", 3);  // los valores se asignan con respecto a su posicion
    System.out.println(Abogado.nombre);
    System.out.println(Abogado.raza);
    System.out.println(Abogado.edad);
    
    // prueba de metodo area de la clase triangulo
    Triangulo Isoceles = new Triangulo();
    Isoceles.altura = 24.5f;
    Isoceles.base = 56.7f;
    Isoceles.area();
    System.out.println(Isoceles.area());
    
    // prueba de encapsulamiento con la clase Usuario
    //Usuario Vexturion = new Usuario();
    Usuario Vexturion = new Usuario("Vexturion","123abc");  // El constructor nos exige establecer parametros
    // Vexturion.username = "Vexturion"; Gracias al constructor esta linea se vuelve innecesaria
    // Vexturion.password = "123abc";  // el objetivo del encapsulamiento es que la contraseña este protegida 
    
    System.out.println(Vexturion.username);
    // System.out.println(Vexturion.password);  // al delimitar el atributo password con private ya no podemos imprimir
    // o modificar el valor password
    
    Vexturion.saluda();
    
    // getters y setters
    Vexturion.setPassword("123abc");  // con el metodo setPassword podemos modificar la contraseña sin hacerlo de manera directa
    System.out.println(Vexturion.getPassword());  // y con el metodo getPassword podemos obtener la contraseña sin hacerlo de forma directa
    
    // Usuario Nessfear = new Usuario(); // como podemos comprobar, al crear un nuevo usuario se ejecuta el constructor y muestra el mensaje
    Usuario Nessfear = new Usuario("Nessfear", "456def");
    
    // Sobre carga de metodos
    Calculadora Suma1 = new Calculadora();
    int resultado = Suma1.suma(10, 20);
    System.out.println("El resultado es " + resultado);
    // podemos comprobar que nuestro metodo suma funciona, sin embargo, es inutil si queremos sumar numeros no enteros
    // actualizamos/sobre cargamos nuestro metodo para que pueda sumar valores de distinto tipo
    Calculadora Suma2 = new Calculadora();
    double resultado2 = Suma2.suma(3.24, 6.7);
    System.out.println("El resultado es " + resultado2);
    // ahora nuestro metodo puede sumar decimales sin problemas
    
    // sobre carga de constructores
    Usuario Ciborg = new Usuario();  // nuestro constructor no recibe ningun parametro
    Usuario Lovegood = new Usuario ("Lovegood");  // nuestro constructor recibe unicamenre el parametro username
    // al hacer esto antes de sobre cargar el constructor nos mostraba error, ahora nuestro codigo funciona de manera correcta
    
    // prueba multiples parametros
    Calculadora Suma3 = new Calculadora();
    int resultado3 = Suma3.suma(3,3,4,6,7,8,3,2);
    System.out.println("La suma de n cantidad de numeros es " + resultado3);
    
    // Al ser static podemos hacer uso del atributo sin necesidad de crear un nuevo objeto de la clase circulo
    System.out.println(Circulo.pi);
    
    Circulo Circulo1 = new Circulo(5f); // nuestro constructor nos exige agregar un radio
    Circulo1.area();
    System.out.println(Circulo1.area());
    
    Gato Iris =  new Gato ("Iris", "Comun de pelo corto", 3);
    // Iris.establecerParametros("Iris", "comun de pelo corto", 3);
    
    Mofi.hablar();
    Iris.hablar();
    
    Iris.dormir();
    

    // Principio de sustitucion
    // si quisieramos hacer un arreglo de figuras tendriamos que tener
    // un arreglo para cada tipo de figura, lo que no seria rentable.
    // Para eso existe el principio de sustitucion que nos indica que podemos tratar a las subclases como clases principales,
    // a clases hijas como clases padre
    Figura circulito = new Circulo (9f);
    Figura triangulito = new Triangulo(10f,5f); // colocamos la clase Figura unicamente del lado izquierdo del circulo
    // ambos, circulos y triangulos son TAMBIEN figuras, de la misma forma que gato y perro son mascotas.
    
    Figura figuras [] = new Figura [2];
    figuras [0] = circulito;
    figuras [1] = triangulito;
    System.out.println(figuras[0].area() + " Este es el area de circulito desde un arreglo");
    System.out.println(figuras[1].area() + " Este es el area de triangulito desde un arreglo");
    
    System.out.println(circulito.area());
    System.out.println(triangulito.area());
    }
    
}
