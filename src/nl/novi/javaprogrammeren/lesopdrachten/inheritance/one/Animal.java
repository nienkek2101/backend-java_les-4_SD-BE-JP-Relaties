package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Animal {
    // Variabelen - Allemaal
    private String name;
    private String sex;

    // Constructor(s)

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }


    // Setter


    // Methodes

    // methode om te bewegen
    public void isMoving() {

    }
    // methode om geluid te maken
    public void makesNoise() {

    }
    // methode voor slapen
    public void isSleeping() {
        System.out.println( getName() + " slaapt 8 uur per dag.");

    }
    // methode voor eten, met (String food) tussen haakjes
    public void isEating(String food) {

    }

}
