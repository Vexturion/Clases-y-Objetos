package clases.y.objetos;

public class Triangulo extends Figura {

// retornar valores
    // para retornar valores eliminamos la palabra void
float base;
float altura;

@Override
/*void*/public float area(){ // eliminamos la palabra void y colocamos el valor a retornar
    //float area = (this.base*this.altura)/2;
    //return area; // colocamos return y el valor a retornar
    return (this.base*this.altura)/2; // realizamos un refactor para que quede en una sola linea


}

public Triangulo(float base, float altura){
    this.base = base;
    this.altura = altura;
}

public Triangulo() {
}

}
