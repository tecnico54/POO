
public class EjecutarComposicionAgregacion {
    
    public static void main(String[] args) {
        
        //Creación de los objetos para validar el modelo
        Cuenta[] c = new Cuenta[2]; //Creación de una estructura de arreglos para las cuentas
        c[0] = new Cuenta(10203456, "Ahorros", 2000.0);
        c[1] = new Cuenta(20250106, "Corriente", 5000.0);
        /*
        Cuenta objCuenta1 = new Cuenta(10203456, "Ahorros", 2000.0);
        Cuenta objCuenta2 = new Cuenta(20250106, "Corriente", 5000.0);
        */
        
        Client objClient1 = new Client(1011345678, "Daniel Arboleda");
        Client objClient2 = new Client(31789087, "Mariana Atehortua");

        Banco objBanco1 = new Banco("Bancarota", "Calle 5ta", c);
        System.out.println(objBanco1);
        System.out.println(objBanco1.consultarClient(objClient2));        

    }

}
