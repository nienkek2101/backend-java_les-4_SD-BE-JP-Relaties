package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Wolf extends WildAnimal {
    // Variabelen
    private String type = "wolf";
    private String nameOfPack;

    // Constructor
    public Wolf(String name, String sex) {
        super(name, sex);
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getNameOfPack() {
        return nameOfPack;
    }


    // Setters
    public void setNameOfPack(String nameOfPack) {
        this.nameOfPack = nameOfPack;
    }

    // Methodes
}
