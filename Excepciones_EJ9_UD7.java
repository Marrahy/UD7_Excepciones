// Ejercicio 9
// Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner),
// calcule A/B y muestre el resultado por pantalla. Se deberán tratar de forma independiente
// las dos posibles excepciones, InputMismatchException y ArithmeticException,
// mostrando en cada caso un mensaje de error diferente en cada caso.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones_EJ9_UD7 {
    
    private static Scanner input = new Scanner(System.in);
    private static int A;
    private static int B;
    
    public static void main(String[] args) {
    
        for (int i = 1; i <= 2;) {
            System.out.print("Introduce el valor " + i + ": ");
            try {
                if (i == 1) {
                    A = input.nextInt();
                    i++;
                }
                else {
                    B = input.nextInt();
                    i++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero.");
                input.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0");
                input.nextLine();
            }
        }
        System.out.println("División: " + (A / B));
    }
}
