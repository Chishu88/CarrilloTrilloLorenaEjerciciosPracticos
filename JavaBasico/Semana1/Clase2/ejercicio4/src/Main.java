import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Imagina que estás trabajando en un sistema de reservas de asientos para un teatro.
        Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:

        - Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

        - Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2").
        El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.

        - Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.

        - A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.

        - Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro.
        ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?

        - El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.

        Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.*/


        Scanner sc = new Scanner(System.in);

        // Create a 5x5 matrix to represent the seating map
        char[][] mapSeats = new char[5][5];

        // Initialise seat map with "O" (empty)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mapSeats[i][j] = 'O';
            }
        }

        // Loop to manage seat bookings
        while (true) {
            showSeatMap(mapSeats);

            // Ask the user for the row and seat number.
            System.out.print("Enter row (1-5): ");
            int row = sc.nextInt() - 1;

            System.out.print("Ingrese el número de asiento (1-5): ");
            int numberSeat = sc.nextInt() - 1;

            // Check if the seat is empty and mark it as occupied.
            if (row >= 0 && row < 5 && numberSeat >= 0 && numberSeat < 5) {
                if (mapSeats[row][numberSeat] == 'O') {
                    mapSeats[row][numberSeat] = 'X';
                    System.out.println("Booking successful. Seat marked as occupied.");
                } else {
                    System.out.println("Seat is taken. Please choose another seat.");
                }
            } else {
                System.out.println("Invalid row or seat number. Please choose another.");
            }


            System.out.print("Would you like to make another reservation (y/n): ");
            String answer = sc.next().toLowerCase();
            if (answer.equals("n")) {
                break;
            }
        }

        // Show the final seating map
        System.out.println("The final seating map:");
        showSeatMap(mapSeats);

        sc.close();
    }

    // Show  seats map.
    private static void showSeatMap(char[][] mapa) {
        System.out.println("Seat map:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}

