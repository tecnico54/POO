// Clase Foto
public class Foto {
    // Encapsulamiento
    private String fichero;

    public Foto(String fichero){
        if(fichero == null || fichero.isEmpty()){
            throw new IllegalArgumentException("El nombre del fichero no puede estar vacío");
        }
        this.fichero = fichero;
    }

    public void print(){
        System.out.println("Mostrando foto: " + fichero);
    }

    public String getDescripcion(){
        return "Archivo de foto: " + fichero;
    }

    @Override
    public String toString(){
        return "Foto { Fichero: " + fichero + " }";
    }
}