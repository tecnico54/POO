public class Ejecucion{
    public static void main(String[] args){
        //Vehiculo 1
        Vehiculo objVehiculo1 = new Vehiculo("Toyota", "Blanca", "TS3456WE", "150HP", 2.3, 4500.0);
        //Vehiculo 2
        Vehiculo objVehiculo2;
        objVehiculo2 = new Vehiculo("Ferrari", "Rojo", "SEWR567UY", "450HP", 1.8, 500.0);
        //Mostrar 
        System.out.println(objVehiculo1.getMarca());
        //Se modifica el vehiculo 1
        objVehiculo1.setMarca("Chevrolet");
        //Mostrar
        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo2);

    }
}