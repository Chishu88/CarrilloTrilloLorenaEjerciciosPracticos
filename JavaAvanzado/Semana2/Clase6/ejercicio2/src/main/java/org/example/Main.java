package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Manually defined pets
        Pet<String> pet = new Pet<>("Chishu", 15, "Dog");
        Pet<String> pet1 = new Pet<>("Iron", 11, "Dog");
        Pet<String> pet2 = new Pet<>("Meve", 5, "Cat");
        Pet<String> pet3 = new Pet<>("Pompom", 3, "Rabbit");
        Pet<String> pet4 = new Pet<>("Pandereta", 5, "Rabbit");
        Pet<String> pet5 = new Pet<>("Loba", 5, "Dog");

        RegisterPet<String> registerPet = new RegisterPet<>();
        registerPet.addPet(pet);
        registerPet.addPet(pet1);
        registerPet.addPet(pet2);
        registerPet.addPet(pet3);
        registerPet.addPet(pet4);
        registerPet.addPet(pet5);

        // Generate random.
        int randomAmount = 5;
        registerPet.generateRandomData(randomAmount);

        List<Pet<String>> searchByName = registerPet.searchByName("Chishu");
        System.out.println("Dog with name Chishu: " + searchByName);

        List<Pet<String>> searchBySpecieDog = registerPet.searchBySpecie("Dog");
        System.out.println("Show all dogs: " + searchBySpecieDog);

        List<Pet<String>> searchBySpecieCat = registerPet.searchBySpecie("Cat");
        System.out.println("Show all cats: " + searchBySpecieCat);

        List<Pet<String>> searchBySpecieRabbit = registerPet.searchBySpecie("Rabbit");
        System.out.println("Show all rabbits: " + searchBySpecieRabbit);

        int countPet = registerPet.countTotalPet();
        System.out.println("Total pets in the register : " + countPet);

    }
}