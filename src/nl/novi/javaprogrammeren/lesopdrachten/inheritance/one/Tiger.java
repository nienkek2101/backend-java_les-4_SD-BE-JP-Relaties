package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Tiger extends WildAnimal {
    // Variabelen
    private String type = "tijger";
    private int numberOfStripes;

    // Constructor
    public Tiger(String name, String sex) {
        super(name, sex);
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }


    // Setters
    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }


    // Methodes
    @Override
    public void makesNoise() {
        System.out.println(getName());

    }

    public void printString() {
        System.out.println(capitalizeName(getName()) + " is een " + getType() + " en heeft " + getNumberOfStripes() + " strepen");
        // Hoe kom ik hieronder bij de naam.isMoving functie.
//        System.out.println( + " beweegt met een snelheid van " );
        System.out.println(capitalizeName(getName()));
    }

}
