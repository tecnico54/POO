import java.util.Random;
public class Personajes{
    protected String nombre;
    protected int puntosDeVida;
    public Personajes(String nombre, int puntosDeVida){
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }
    public void atacar(Personajes oponente){
        Random random = new Random();
        int danio = 10 + random.nextInt(21); //Daño entre 10 y 30
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " y le causa " + danio + " de daño.");
        oponente.puntosDeVida -= danio;
        if (oponente.puntosDeVida < 0) oponente.puntosDeVida = 0;
    }
    public boolean estaVivo(){
        return puntosDeVida > 0;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPuntosDeVida(){
        return puntosDeVida;
    }
}