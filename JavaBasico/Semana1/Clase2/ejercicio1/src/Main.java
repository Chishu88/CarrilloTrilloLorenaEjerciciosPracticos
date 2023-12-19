import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*a) Una recital permite únicamente el ingreso de mayores de 18 años.
            Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
        El programa debe mostrar (según cada caso) un mensaje informando la situación.*/


        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You may enter to recital. Welcome.");
        }else{
            System.out.println("You are under age, you may not enter the event.");
        }

        sc.close();

    }
}