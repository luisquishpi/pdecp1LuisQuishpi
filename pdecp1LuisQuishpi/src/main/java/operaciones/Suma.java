package operaciones;

public class Suma extends Operaciones {

    private int valor1;
    private int valor2;
    public Suma(int operator1, int operator2) {
        this.valor1=operator1;
        this.valor2=operator2;
    }

    public double calcular() {
        return this.valor1+this.valor2;
    }
    public String getNombre(){
        return "+";
    }

    public int getValor1() {
        // TODO Auto-generated method stub
        return this.valor1;
    }

    public int getValor2() {
        // TODO Auto-generated method stub
        return this.valor2;
    }
    @Override
    public String toString() {
        return "[" + this.valor1 + "+" + this.valor2 + "]";
    }
}
