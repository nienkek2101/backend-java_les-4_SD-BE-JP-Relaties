package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Pet extends Animal {
    // Variabelen
    // Katten + honden - huisdieren
    private String nameOfOwner;
    private String favoriteFoodBrand;
    private String species;

    // Constructor

    public Pet(String name, String sex) {
        super(name, sex);
    }

    // Getters
    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public String getSpecies() {
        return species;
    }


    // Setters
    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    // Methodes
    @Override
    public void isMoving() {
        System.out.println("Hij beweegt 0.25");
    }
}
