package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Dog extends Pet {
    // Variabelen
    private String type = "hond";

    // Constructor
    public Dog(String name, String sex) {
        super(name, sex);
    }

    // Getter

    public String getType() {
        return type;
    }
}
