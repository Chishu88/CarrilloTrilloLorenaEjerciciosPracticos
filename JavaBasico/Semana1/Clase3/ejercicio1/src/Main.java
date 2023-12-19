public class Main {
    public static void main(String[] args) {

         /*Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos:
        cod, marca, modelo, consumo y color.

        Luego, realiza las siguientes acciones:

        a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.

                b) Crea 1 objeto de la clase Electrodomestico sin parámetros.

                c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.

        d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?*/

        Electrodomestico electrodomestico1 = new Electrodomestico();
        Electrodomestico electrodomestico2 = new Electrodomestico("1234", "Phillips", "aspirador", "1200w", "Negro");
        Electrodomestico electrodomestico3 = new Electrodomestico("1547", "Cecotec", "batidora", "1400w", "Blanco");
        Electrodomestico electrodomestico4 = new Electrodomestico("1547","LG", "televisor", "600w", "Gris");


        System.out.println("Electrodoméstico 2: " + electrodomestico2.getMarca() + ", " + electrodomestico2.getModelo() + ", " + electrodomestico2.getConsumo());
        System.out.println("Electrodoméstico 3: " + electrodomestico3.getMarca() + ", " + electrodomestico3.getModelo() + ", " + electrodomestico3.getConsumo());
        System.out.println("Electrodoméstico 4: " + electrodomestico4.getMarca() + ", " + electrodomestico4.getModelo() + ", " + electrodomestico4.getConsumo());

        // Intentar obtener la marca del electrodoméstico creado sin parámetros
        System.out.println("Electrodomestico 1: " + electrodomestico1.getMarca());
        // El valor obtenido es null


    }
}

