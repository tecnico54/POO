public class Ejecutar{
    public static void main(String[] args){
        Cuenta objCuenta1 = new Cuenta(10203456, "Ahorros", 2000.0);
        Cuenta objCuenta2 = new Cuenta(20250106, "Corriente", 5000.0);
        Cliente objCliente1 = new Cliente(1011345678, "Daniel Arboleda");
        Cliente objCliente2 = new Cliente(31789087, "Mariana Atehortua");
        Banco objBanco1 = new Banco("Bancolombia", "Calle 5A #27-55", objCuenta1);
        Banco objBanco2 = new Banco("Bancarota", "Calle 5ta", objCuenta2);
        System.out.println(objBanco1);
        System.out.println(objBanco1.consultarCliente(objCliente2));
    }
}
