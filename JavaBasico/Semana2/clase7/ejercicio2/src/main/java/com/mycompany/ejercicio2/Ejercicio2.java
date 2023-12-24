
package com.mycompany.ejercicio2;


import com.mycompany.ejercicio2.models.Dish;
import com.mycompany.ejercicio2.services.PersistenceController;
import java.util.List;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        PersistenceController persistenceController = new PersistenceController();
        
        Dish dish = new Dish("Pasta boloñesa", "pasta, carne, tomate, sofrito", 11.50);
        Dish dish2 = new Dish("Salmorejo", "tomato, bread, oil, garlic", 8.50);
        Dish dish3 = new Dish("Guacamole", "avocado, tomato, onion, lime, salt", 6.50);
        Dish dish4 = new Dish("Risotto", "receta risotto", 12.50);
        Dish dish5 = new Dish("Pizza", "receta pizza", 9.60);
        //persistenceController.createDish(dish5);
        
        dish4.setPrice(14.00);
        persistenceController.deleteDish(5L);
        persistenceController.deleteDish(2L);
        persistenceController.deleteDish(3L);
        persistenceController.deleteDish(4L); 
        persistenceController.deleteDish(10L); 
        persistenceController.deleteDish(11L); 
        persistenceController.deleteDish(12L); 
     
        List<Dish> allDishes = persistenceController.getAllDishes();

    // Show details each dish.
       System.out.println("List of dishes on the data base:");
       for (Dish d : allDishes) {
          System.out.println(d.toString());
    }
  }
}

