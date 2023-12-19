public class Main {
    public static void main(String[] args) {

         /*a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String.
                Asigna un valor a cada variable y muestra su contenido en la consola.*/


        int entero = 3;
        double decimal = 3.14;
        boolean booleano = true;
        String cadena = "Hola, Lorena!";

        System.out.println("El valor de la variable entero:" + entero);
        System.out.println("El valor de la variable decimal:" + decimal);
        System.out.println("El valor de la variable booleano:" + booleano);
        System.out.println("El valor de la variable cadena:" + cadena);


        /*b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa?
        ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar el por qué de cada caso. Debatir con otros compañeros.*/

        /*int entero1 = "Hola, Lorena!" ;
        double decimal1 = true;
        boolean booleano1 = 3.14;
        String cadena1 = 3;

        System.out.println("Valor de la variable 'entero': " + entero);
        System.out.println("Valor de la variable 'decimal': " + decimal);
        System.out.println("Valor de la variable 'booleano': " + booleano);
        System.out.println("Valor de la variable 'cadena': " + cadena);*/

        // Al correr el programa muestra este error por consola: C:\Users\chish\Desktop\Bootcamp-HackBoss\ejercicio2\src\Main.java:23:23
        //java: incompatible types.

    }
}

