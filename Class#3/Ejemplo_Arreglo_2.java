//Dado un arreglo A de N elementos, almacenar los elementos mayores y menores
//que la media, almacenarlos en arreglos diferentes.
//Análisis: necesitamos crear el arreglo de tamaño aleatorio y generar números
//aleatorios para que sean almacenados en el arreglo, posteriormente obtenemos
//la media del arreglo y comparamos cada posición del arreglo para determinar
//si es mayor o menor a la media.
// n será el número aleatorio para el tamaño del arreglo
public class Ejemplo_Arreglo_2{
    public static void main(String[] args){
        int N = (int) (Math.random() * (15 - 5)) + 5;
        int[] A = new int[n];
        for (int i = 0; i < a.length; i++) {
            A[i] = (int) (Math.random() * (50 - 0)) + 0;
            System.out.print(a[i] + " ");
            System.out.println();
        }
        int suma_Arreglo = 0;
        for (int i = 0; i < A.length; i++) {
            suma_Arreglo += A[i];
        }
        double media = suma_Arreglo / A.length;
        System.out.println("La media del arreglo es " + media);
        int contador_Mayor_Media = 0, contador_Menor_Media = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= media) {
                contador_Mayor_Media++;
            }else{
                contador_Menor_Media++;
            }
        }
        int[] mayores = new int[contador_Mayor_Media];
        int[] menores = new int[contador_Menor_Media];
        int pos_Mayores = 0, pos_Menores = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= media) {
                mayores[pos_Mayores] = A[i];
                pos_Mayores++;
            }else{
                menores[pos_Menores] = a[i];
                pos_Menores++;
            }
        }
        for (int i = 0; i < mayores.length; i++) {
            System.out.print(mayores[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < menores.length; i++) {
            System.out.print(menores[i] + " ");
        }

    }
}