package vehiculos;

public class Menu {
    public void iniciar() {
        new MenuControlador();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciar();
    }
}
