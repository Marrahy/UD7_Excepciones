import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejercicio 8
 * Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de
 * Scanner) y luego muestre por pantalla el mensaje “Valor introducido: ...”. Se deberá tratar la
 * excepción InputMismatchException que lanza nextInt() cuando no se introduce un entero
 * válido. En tal caso se mostrará el mensaje “Valor introducido incorrecto”.
 */

public class Excepciones_EJ8_UD7 {

    private static Scanner input = new Scanner(System.in);
    private static int A;

    public static void main(String[] args) {

        System.out.print("Introduce un valor entero: ");
        
        try {

            A = input.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Valor introducido incorrecto, introduce un número entero.");
            
        }
        
        System.out.println(A);
        System.out.println("Programa runeando");

    }


}
