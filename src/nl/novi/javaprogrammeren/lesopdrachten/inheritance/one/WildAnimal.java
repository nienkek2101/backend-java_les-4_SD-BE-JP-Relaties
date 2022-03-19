package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class WildAnimal extends Animal {
    // Variabelen
    // Leeuw + Tijger + Wolf - wilde dieren
    private String nameOfCage;
    private String lastEaten;
    private String countryOfOrigin;

    // Constructor
    public WildAnimal(String name, String sex) {
        super(name, sex);
    }

    // Getters
    public String getNameOfCage() {
        return nameOfCage;
    }

    public String getLastEaten() {
        return lastEaten;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }


    // Setters
    public void setNameOfCage(String nameOfCage) {
        this.nameOfCage = nameOfCage;
    }

    public void setLastEaten(String lastEaten) {
        this.lastEaten = lastEaten;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    // Methodes
    @Override
    public void isMoving() {
        System.out.println(getName().substring(0,1).toUpperCase() + getName().substring(1) + " beweegt met een snelheid van 0.5");
    }

}

