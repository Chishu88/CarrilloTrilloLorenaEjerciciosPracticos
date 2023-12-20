import models.Animal;
import models.Bird;
import models.Mammal;
import models.Reptile;

public class Main {
    public static void main(String[] args) {

        Mammal mammal = new Mammal(1, "Elephant", 8, "thick", "grass",
                4, "viviparous", "grey", "jungle");
        Bird bird = new Bird(2, "Eagle", 5, "Feathers", "meat", 2,
                "glider", "Brown", "Curved Beak");
        Reptile reptile = new Reptile(3, "Cobra", 3, "Scale", "Carnivore", 2,
                "keratinous", "Neurotoxic poison", "desert");

        mammal.saludar();
        bird.saludar();
        reptile.saludar();

        Animal animal = new Mammal(4, "Tiger", 8, "Striped Fur", "carnivore", 4,
                "viviparous", "Yellow and black", "forest");
        animal.saludar();


    }
}