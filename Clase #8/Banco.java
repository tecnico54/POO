import java.util.Arrays;

public class Banco {

    private String nombre;
    private String direccion;
    private Cuenta[] cuenta;

    public Banco(String nombre, String direccion, Cuenta[] cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    public String consultarClient(Client client) {
        return client.toString();
    }

    public String toString() {
        return "Banco { Nombre: " + nombre +
                " Dirección: " + direccion +
                " " + Arrays.toString(cuenta) + "}";
    }
}