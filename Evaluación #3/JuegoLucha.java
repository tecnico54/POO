public class JuegoLucha{
    private Personajes jugador1;
    private Personajes jugador2;
    public JuegoLucha(Personajes p1, Personajes p2){
        this.jugador1 = p1;
        this.jugador2 = p2;
    }
    public void iniciarPelea(){
        System.out.println("¡Comienza la pelea entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!\n");
        boolean turnoJugador1 = true;
        while (jugador1.estaVivo() && jugador2.estaVivo()){
            if (turnoJugador1){
                jugador1.atacar(jugador2);
            }else{
                jugador2.atacar(jugador1);
            }
            System.out.println(jugador1.getNombre() + " tiene " + jugador1.getPuntosDeVida() + " HP");
            System.out.println(jugador2.getNombre() + " tiene " + jugador2.getPuntosDeVida() + " HP\n");

            turnoJugador1 = !turnoJugador1;

            try{
                Thread.sleep(1000); //Pequeña pausa para leer
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Mostrar resultado
        if (jugador1.estaVivo()){
            System.out.println("¡" + jugador1.getNombre() + " ha ganado!");
        }else{
            System.out.println("¡" + jugador2.getNombre() + " ha ganado!");
        }
    }
}