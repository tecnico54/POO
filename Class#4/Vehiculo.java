//Nombre (Instancia)
public class Vehiculo{
    //Atributo
    private String marca;
    private String color;
    private String chasis;
    private String potencia;
    private double peso;
    private double cilindraje;
    //Constructo -> Inicializa el objeto
    public Vehiculo(String marca, String color, String chasis, String potencia, double peso, double cilindraje){
        this.marca = marca;
        this.color = color;
        this.chasis = chasis;
        this.potencia = potencia;
        this.peso = peso;
        this.cilindraje = cilindraje;
    }
    //Metodos Getter / Setter
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    //Metodo para mostrar un objeto
    public String toString(){
        return "Vehiculo {Marca: " + marca + " Color: " + color + " Chasis " + chasis + " Potencia " + potencia + " Peso: " + peso + " Cilindraje: " + cilindraje + "}";
    }
    //Metodo de la clase
    public void acelerar(){
        System.out.println("Vehiculo Acelerando");
    }
    public void frenar(){
        System.out.println("Vehiculo Frenando");
    }
    public void girar_Izquierda(){
        System.out.println("Vehiculo girando a la izquierda");
    }
    public void girar_Derecha(){
        System.out.println("Vehiculo girando a la derecha");
    }
    public void retroceder(){
        System.out.println("Vehiculo retrosediendo");
    }
}