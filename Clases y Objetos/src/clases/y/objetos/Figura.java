package clases.y.objetos;

public abstract class Figura {  // mediante la palabra reservada abstract definimos una clase como abstracta

    private int numeroDeLados;
    public Figura(){
        this.numeroDeLados = 0;
    }
    
public abstract float area(); // un metodo abstracto sera siempre re escrito por las clases hijas, es por eso que usamos la 
                           // palabra reservada abstract. El metodo dira QUE hacer pero no COMO hacerlo asi que eliminamos tambien
                           // el cuerpo del metodo {}
 // nuestra clase abstraca podra heredar a n cantidad de clases PERO no podra ser instanciada, es decir, no podra crear objetos

}

