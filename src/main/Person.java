package main;

/**
 * Ma classe Person represente un humain
 */
public class Person {

    private Pet myPet;

    /**
     * Constructeur d'objets de classe Person
     */
    public Person() {
        // initialisation des variables d'instance
    }

    public void adoptPet() {
        this.myPet = new Pet();
        this.myPet.setOwner(this);
    }

    public Pet getPet() {
        return this.myPet;
    }

    public void giveNameToPet(String name) {
        this.myPet.setName(name);
    }
}