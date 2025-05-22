public class Survivor{
    public static void main(String[] args){
        Personajes guerrero = new Guerrero("Arthas");
        Personajes mago = new Mago("Merlín");

        JuegoLucha juego = new JuegoLucha(guerrero, mago);
        juego.iniciarPelea();
    }
}