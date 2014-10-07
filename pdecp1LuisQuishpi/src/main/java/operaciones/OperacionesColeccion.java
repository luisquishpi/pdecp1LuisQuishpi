package operaciones;

import java.util.ArrayList;

public class OperacionesColeccion {

    private ArrayList<Operaciones> operaciones=new ArrayList<Operaciones>();

    public void add(Operaciones operacion) {
        operaciones.add(operacion);
    }
    public void clear() {
        operaciones.clear();
    }
    public int total() {
        int result = 0;
        String separator = "";
        for (Operaciones operando : operaciones) {
            if (operando != null) {
                System.out.print(separator + operando.toString());
                    result += operando.calcular();
            }
            separator = operando.getNombre();
        }
        System.out.print(">>> ");
        return result;
    }
}
