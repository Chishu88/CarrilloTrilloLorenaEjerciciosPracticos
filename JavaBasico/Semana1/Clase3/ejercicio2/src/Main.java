public class Main {
    public static void main(String[] args) {

         /*Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
        (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

        a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.

         b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

        c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.

        d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.*/


        // Crear vector de 5 posiciones
        Persona[] persona = new Persona[5];

        persona[0] = new Persona(1, "Lorena", "Calle Jaen", 25, "654897852");
        persona[1] = new Persona(2, "Rafa", "Calle Priego", 38, "521458796");
        persona[2] = new Persona(3, "Miriam", "Calle Castro", 27, "547852145");
        persona[3] = new Persona(4, "Diederik", "Calle Breda", 39, "521458796");
        persona[4] = new Persona(5, "Eloisa", "Calle Córdoba", 58, "54125874");

        for(int i = 0; i < persona.length; i++) {
            if (persona[i] != null) {
                System.out.println("Nombre: " + persona[i].getNombre() + ". Edad: " + persona[i].getEdad());

            }
        }

        // Cambiar el nombre
        persona[1].setNombre("Juan");
        persona[2].setNombre("Adriana");

        System.out.println("\nDespués de cambiar los nombres:");

        for(int i = 0; i < persona.length; i++) {
            System.out.println("Nombre: " + persona[i].getNombre() + ", Edad: " + persona[i].getEdad());
        }

        System.out.println("\nPersonas mayores de 30 años: ");

        // Mostrar personas mayores de 30 años
        for(int i = 0; i < persona.length; i++){
            if(persona[i].getEdad() > 30){
                System.out.println("Nombre: " + persona[i].getNombre() + ", Edad: " + persona[i].getEdad());
            }
        }
    }
}
