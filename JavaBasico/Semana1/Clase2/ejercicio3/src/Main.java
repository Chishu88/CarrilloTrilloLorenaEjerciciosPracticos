import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         /* Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
        calcule la temperatura máxima promedio que hubo.

        Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
        Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.*/

        Scanner sc = new Scanner(System.in);

        // Declare an array to store the temperatures
        int[] temperaturesMaximums = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the maximum temperature of the day " + (i + 1) + ": ");
            temperaturesMaximums[i] = sc.nextInt();
        }

        // Calculate the average maximum temperature for the day
        int sumTemperatures = 0;
        for (int i = 0; i < 7; i++) {
            sumTemperatures += temperaturesMaximums[i];
        }

        int averageTemperatures = sumTemperatures / 7;

        System.out.println("The average of the maximum temperatures for the last week is: " + averageTemperatures);

        sc.close();

    }
}
 