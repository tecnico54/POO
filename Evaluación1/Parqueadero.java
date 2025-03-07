import java.util.Scanner;
public class Parqueadero{
    // Variables globales
    static final int NUM_PUESTOS = 10; // Número total de puestos del parqueadero
    static boolean[] puestos = new boolean[NUM_PUESTOS]; // Estado de los puestos: true = ocupado, false = libre
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int opcion;
        // Inicializar todos los puestos como libres
        for (int i = 0; i < NUM_PUESTOS; i++) {
            puestos[i] = false;
        }
        do {
            // Menú principal
            System.out.println("Menú Principal:");
            System.out.println("1. Registro de motos");
            System.out.println("2. Cobros del parqueadero");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    // Submenú de registro de motos
                    menuRegistroMotos();
                    break;
                case 2:
                    // Submenú de cobros del parqueadero
                    menuCobros();
                    break;
                case 3:
                    // Salir de la aplicación
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 3);
    }
    // Menú de registro de motos
    public static void menuRegistroMotos() {
        System.out.println("Seleccione el tipo de moto:");
        System.out.println("1. Bajo Cilindraje");
        System.out.println("2. Alto Cilindraje");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        switch (opcion) {
            case 1:
                // Registro de moto de bajo cilindraje
                System.out.println("Registrar moto de Bajo Cilindraje:");
                // Aquí agregarás los detalles de la moto de bajo cilindraje
                break;
            case 2:
                // Registro de moto de alto cilindraje
                System.out.println("Registrar moto de Alto Cilindraje:");
                // Aquí agregarás los detalles de la moto de alto cilindraje
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
    // Menú de cobros del parqueadero
    public static void menuCobros() {
        System.out.println("Esquema de los puestos del parqueadero:");
        mostrarPuestos();
        System.out.print("Seleccione el puesto para estacionar la moto (0 - " + (NUM_PUESTOS - 1) + "): ");
        int puestoSeleccionado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (puestoSeleccionado < 0 || puestoSeleccionado >= NUM_PUESTOS || puestos[puestoSeleccionado]) {
            System.out.println("Este puesto no está disponible. Seleccione otro.");
        } else {
            puestos[puestoSeleccionado] = true; // Marcar el puesto como ocupado
            System.out.println("Puesto asignado correctamente.");

            System.out.print("Ingrese el tiempo de estacionamiento en minutos: ");
            int tiempoEstacionamiento = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Llamar a la función de cobro
            calcularCobro(tiempoEstacionamiento);
        }
    }
    // Mostrar los puestos del parqueadero
    public static void mostrarPuestos() {
        for (int i = 0; i < NUM_PUESTOS; i++) {
            System.out.print("Puesto " + i + ": ");
            if (puestos[i]) {
                System.out.println("Ocupado");
            } else {
                System.out.println("Libre");
            }
        }
    }
    // Calcular el cobro según el tiempo de estacionamiento
    public static void calcularCobro(int tiempoEstacionamiento) {
        int costo = 0;

        if (tiempoEstacionamiento <= 30) {
            costo = 0; // Primeros 30 minutos son gratuitos
        } else if (tiempoEstacionamiento <= 60) {
            costo = 800; // Entre 31 y 60 minutos
        } else {
            costo = 2000; // Más de 60 minutos
        }
        System.out.println("El costo por el tiempo de estacionamiento es: $" + costo);
    }
}