package operaciones;

public abstract class Operaciones {

    private int valor1;
    private int valor2;
    public Operaciones(int valor1, int valor2) {
        this.valor1=valor1;
        this.valor2=valor2;
    }
    public int getValor1(){
        return this.valor1;
    }
    public int getValor2(){
        return this.valor2;
    }
    public abstract int calcular();
    public abstract String getNombre();
}
