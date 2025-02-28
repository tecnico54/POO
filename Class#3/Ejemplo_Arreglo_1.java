//Dado un arreglo lineal de números, sumar separadamente
         //los números pares y los números impares.
         //Análisis: declarar un arreglo, en dos variables ir guardando
         //la suma de los números pares y números impares, lo anterior
         //debe iterar en un "for" con la condición de validar si el
         //número es par o impar (n%2 == 0 -> par):
public class Ejemplo_Arreglo_1{
    public static void main(String[] args){
        int[] arreglo = {5, 2, 6, 5, 9, 90, 1, 8, 15, 4};
        int suma_pares = 0, suma_impares = 0;
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] %2 == 0){
                suma_pares += arreglo[i];
            }else{
                suma_impares += arreglo[i];
             }
        }
        System.out.println("La suma de los números pares es: " + suma_pares);
        System.out.println("La suma de los números impares es: " + suma_impares);
    }
}