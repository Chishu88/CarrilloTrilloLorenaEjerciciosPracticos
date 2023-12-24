
package com.mycompany.ejercicio2.services;

import com.mycompany.ejercicio2.models.Dish;
import com.mycompany.ejercicio2.persistence.DishJpaController;
import com.mycompany.ejercicio2.persistence.exceptions.NonexistentEntityException;
import java.util.List;

public class PersistenceController {
    
    DishJpaController dishJPA = new DishJpaController();

  public void createDish(Dish dish){
    dishJPA.create(dish);
  }
  
  public void deleteDish(Long id){
    try {
      dishJPA.destroy(id);
    } catch (NonexistentEntityException ex) {
      ex.printStackTrace();
    }
  }
  
  public List<Dish> getAllDishes(){
    return dishJPA.findDishEntities();
  }
  
  public void updateDish(Dish dish){
    try {
      dishJPA.edit(dish);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
