package operaciones;

public class Producto extends Operaciones{

    public Producto(int operator1, int operator2) {
        super(operator1,operator2);
    }

    public int calcular() {
        return super.getValor1()*super.getValor2();
    }
    public String getNombre(){
        return "*";
    }
    @Override
    public String toString() {
        return "[" + this.getValor1() + this.getNombre() + this.getValor2() + "]";
    }
}
