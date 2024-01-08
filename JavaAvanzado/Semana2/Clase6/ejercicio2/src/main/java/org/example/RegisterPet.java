package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegisterPet <T> {

    private List<Pet<T>> register;
    private List<T> availableSpecies;

    public RegisterPet(){
        this.register = new ArrayList<>();
        this.availableSpecies = new ArrayList<>();
    }

    public void addPet (Pet<T> pet){
        register.add(pet);
    }

    public List<Pet<T>> searchByName(String name){
        List<Pet<T>> resultName = new ArrayList<>();
        for(Pet<T> pet : register){
            if(pet.getName().equalsIgnoreCase(name)){
                resultName.add(pet);
            }
        }
        return resultName;
    }

    public List<Pet<T>> searchBySpecie(String specie){
        List<Pet<T>> resultSpecie = new ArrayList<>();
        for(Pet<T> pet : register){
            if(pet.getSpecie().equals(specie)){
                resultSpecie.add(pet);
            }
        }
        return resultSpecie;
    }

   public int countTotalPet(){
        return register.size();
   }

   public void generateRandomData(int amount){
        Random random = new Random();

        availableSpecies.add((T) "Dog");
        availableSpecies.add((T) "Cat");
        availableSpecies.add((T) "Rabbit");
        availableSpecies.add((T) "Bird");

        for(int i=0; i < amount; i++){
            String name = generateRamdonName();
            int age = random.nextInt(15) +1;
            T specie = availableSpecies.get(random.nextInt(availableSpecies.size()));
            Pet<T> pet = new Pet<>(name, age, specie);
            addPet(pet);
        }
   }

   public String generateRamdonName(){
        String[] names = {"Iron", "Chishu", "Pompom", "Loba", "Caia", "Milo", "Lyra", "Rakan", "Yako", "Copito", "Meve", "Tambor"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
   }

}
