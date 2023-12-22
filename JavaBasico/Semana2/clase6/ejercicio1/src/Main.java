import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       /* Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de venta de autos.
        Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.

                a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos:
        id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.

                b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia() y recargarCombustible() respectivamente.
            En ambos casos, cuando se implementen en sus respectivas clases, deben mostrar un mensaje de qué tipo de recarga están haciendo.

        c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos específicos para los autos eléctricos,
                como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.

                d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las
        camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

                e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las motos de
    combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

                f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas de combustión, motos de combustión)
        y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.

        g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.

        Nota: Recuerda que la antigüedad de un vehículo se calcula restando del año actual el año de fabricación del auto. Por ejemplo: 2023 - 2018= 5 años de antigüedad*/


      ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(1, "ABC001", "ModelA", 2019, 25000.0, 5000, 10.5));
        vehicles.add(new Motorcycle(2, "DEF002", "ModelB", 2020, 15000.0, 250, "Petrol"));
        vehicles.add(new Truck(3, "GHI003", "ModelC", 2021, 60000.0, 200, 12.0));
        vehicles.add(new Car(4, "JKL004", "ModelD", 2018, 30000.0, 6000, 15.5));
        vehicles.add(new Motorcycle(5, "MNO005", "ModelE", 2017, 18000.0, 300, "Diesel"));
        vehicles.add(new Truck(6, "PQR006", "ModelF", 2019, 40000.0, 100, 15.0));


        for (Vehicle vehicle : vehicles) {
            vehicle.vehicleAge();

            if (vehicle instanceof Electrical) {
                ((Electrical) vehicle).chargeEnergy();
            } else if (vehicle instanceof Combustion) {
                ((Combustion) vehicle).chargeFuel();
            }

            System.out.println("-----");
        }
    }
}