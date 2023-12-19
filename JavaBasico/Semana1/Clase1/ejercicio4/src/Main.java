import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         /*Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos:
        suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

        Sugerencia: Compara los resultados que obtengas con otros compañeros.
        Pide a tus compañeros que te digan números al azar y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.

        Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora…
        ¿De qué manera tratarías de evitar ésta situación?*/


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        int sum = number1 + number2;
        int subtract = number1 - number2;
        int multiply = number1 * number2;


        // Check if the second number is non-zero before division
        if (number2 != 0) {
            int division =  number1 / number2;
            System.out.println("The division of " + number1 + " by " + number2 + " is: " + division);
        } else {
            System.out.println("Cannot divide by zero. Please enter a second non-zero number.");
        }

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
        System.out.println("The subtraction of " + number1 + " and " + number2 + " is: " + subtract);
        System.out.println("The multiplication of " + number1 + " by " + number2 + " is: " + multiply);

        sc.close();

    }
}