import java.util.Random;
import java.util.Scanner;

public class Main {
    private static boolean encontrado = false;
    private static final int[] myArray = new int[100];
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();
    public static void main(String[] args) {
        //Rellenar el array de aleatorios
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(1,1000);
        }
        //Imprimir por pantalla mensaje para leer un número
        System.out.println("Digite un número que será buscado dentro del array:");
        int n = sc.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            //Validar si el número existe en el array
            if (myArray[i] == n) {
                System.out.println("Número encontrado en la posición: "+ i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El número no fue encontrado.");
        }
    }
}