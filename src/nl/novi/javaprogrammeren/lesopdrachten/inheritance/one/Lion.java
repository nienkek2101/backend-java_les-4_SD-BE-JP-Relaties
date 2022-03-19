package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Lion extends WildAnimal {
    // Variabelen
    private String type = "leeuw";
    private int numberOfKids;

    // Constructor
    public Lion(String name, String sex) {
        super(name, sex);
    }


    // Getters
    public String getType() {
        return type;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }


    // Setters
    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }


    // Methodes
}
