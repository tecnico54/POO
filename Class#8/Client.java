public class Client{
    private long cedula;
    private String nombre;
    public Client(long cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public String toString(){
        return "Cliente { CC: " + cedula + " Numero de cuenta: " + nombre + "}";
    }
}