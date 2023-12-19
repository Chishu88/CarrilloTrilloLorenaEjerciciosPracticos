import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         /* a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.

        Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar.
        Luego, muestra el total de la compra que debe abonar.

        Pista: Recuerda que existen dos tipos de bucles, los controlador por un contador (cuando sabemos un número exacto de productos por ejemplo) u por centinela
        (cuando no sabemos cuántos productos va a comprar el cliente). En este caso debes aplicar un “centinela”.
         Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.*/

        Scanner sc = new Scanner(System.in);

        double totalPurchase = 0;

        System.out.println("Welcome to the supermarket checkout system.");

        // Loop with sentinel for price entry
        while (true) {
            System.out.print("Enter the price of the product (enter a negative number or 0 to finish): ");
            double priceProduct = sc.nextDouble();

            // Check if the user wants to finalize
            if (priceProduct <= 0) {
                break;
            }

            // Accumulate the price to the purchase total
            totalPurchase += priceProduct;
        }

        // String.format to display the purchase total to two decimal places
        System.out.println("The purchase total is: " + String.format("%.2f", totalPurchase) + "€.");

        sc.close();


    }
}