package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Cat extends Pet {
    // Variabelen
    private String livingInsideOrOutdoor;
    private String type = "kat";

    // Constructor


    public Cat(String name, String sex) {
        super(name, sex);
    }

    // Getters
    public String getLivingInsideOrOutdoor() {
        return livingInsideOrOutdoor;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setLivingInsideOrOutdoor(String livingInsideOrOutdoor) {
        this.livingInsideOrOutdoor = livingInsideOrOutdoor;
    }

    // Methodes
}
