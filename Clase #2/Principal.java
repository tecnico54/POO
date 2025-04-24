class Carro{
    String color;
    String marca;
    void acelerar(){
        System.out.println("El carro está acelerando");
    }
}
public class Principal{
    public static void main (String[] args){
        Carro miCarro = new Carro();
        miCarro . color = "Rojo";
        miCarro . marca = "Toyota";
        miCarro . acelerar();
    }
}