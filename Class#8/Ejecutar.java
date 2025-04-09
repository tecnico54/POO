public class Ejecutar{
    public static void main(String[] args){
        Cuenta[] c = new Cuenta[2];
        c[0] = new Cuenta(10203456, "Ahorros", 2000.0);
        c[1] = new Cuenta(20250106, "Corriente", 5000.0);
        Client objCliente1 = new Client(1011345678, "Daniel Arboleda");
        Client objCliente2 = new Client(31789087, "Mariana Atehortua");
        Banco objBanco1 = new Banco("Bancolombia", "Calle 5A #27-55", c);
        Banco objBanco2 = new Banco("Bancarota", "Calle 5ta", c);
        System.out.println(objBanco1);
        System.out.println(objBanco1.consultarCliente(objCliente2));
    }
}
