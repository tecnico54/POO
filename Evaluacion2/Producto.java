// Clase base: Producto
public class Producto {
    // Encapsulamiento: atributos privados con acceso controlado mediante métodos publicos
    private int numero; 

    public Producto(int numero){
        this.numero = numero;
    }

    // Metodo que puede ser sobrescrito por subclases
    public String getDescripcion(){
        return "Producto genérico con número " + numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    @Override
    public String toString(){
        return getDescripcion();
    }
}