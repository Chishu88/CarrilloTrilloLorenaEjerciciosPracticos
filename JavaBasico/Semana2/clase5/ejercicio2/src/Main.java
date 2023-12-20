import models.*;

public class Main {
    public static void main(String[] args) {

        /*Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).

        a) Crear las siguientes clases hijas que compartan sus atributos y métodos:

        Zapato: material, tipoCierre

        Pantalon: estilo, tipoTejido

        Camiseta: manga, cuello

        Sombrero: tipo, tamaño

        b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero
            (crear un objeto con parámetros para cada uno de ellos).

         c) Crear los siguientes métodos (en cada subclase correspondiente):

        Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).

        Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).

        Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).

        Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).

        d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.

        PISTA: Todos tendrán el mismo método, con el mismo nombre, pero únicamente cambia el mensaje que muestran.
        Tener en cuenta para esto la implementación de herencia y sobrescritura de métodos.*/

        Outfit[] outfit = new Outfit[9];

        outfit[0] = new Shoe(1, "boots", 25.50, "xTi", 40, "black", "plastic", "zipper");
        outfit[1] = new Shoe(2, "sneaker", 31.00, "Nike", 38, "White", "fabric", "laces");
        outfit[2] = new Shoe(3, "flip flop", 15.50, "Hawaiana", 39, "yellow and pink", "rubber", "");

        outfit[3] = new Pants(4, "jeans", 80.00, "Levis", 40, "grey", "straight", "denim");
        outfit[4] = new Pants(5, "trouser", 22.95, "Zara", 40, "beige", "momFit", "denim");
        outfit[5] = new Pants(6, "jeans", 50.00, "Diesel", 40, "black", "straight", "leatherette");

        outfit[6] = new Tshirt(7, "t-shirt", 25.00, "JvZ", 40, "green", "sleeve long", "round");
        outfit[7] = new Tshirt(8, "t-shirt", 30.00, "Springfield", 42, "red", "sleeve short", "round");

        outfit[8] = new Hat(9, "hat", 25.00, "Parfois", 38, "brown", "casual", "small");

        /*for (int i = 0; i < outfit.length; i++){
            outfit[i].showOutfit();
        }*/

        for (Outfit element : outfit) {
            element.showOutfit();
        }

    }
}