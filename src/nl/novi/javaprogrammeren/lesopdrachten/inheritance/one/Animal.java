package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class Animal {
    // Variabelen - Allemaal
    private String name;
    private String sex;

    // Constructor(s)

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Animal() {

    }

//    public Animal() {
//    }

    // Getters

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }


    // Setter


    // Methodes
    // methode naam met hoofdletter
    public String capitalizeName(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);

    }

    // methode om te bewegen
    public void isMoving() {
        System.out.println( getName() + " beweegt met onbekende snelheid");

    }
    // methode om geluid te maken
    public void makesNoise() {
        System.out.println( getName() + " maakt onbekend geluid");

    }
    // methode voor slapen
    public void isSleeping() {
        System.out.println( getName() + " slaapt 8 uur per dag.");

    }
    // methode voor eten, met (String food) tussen haakjes
    public void isEating(String food) {

    }

}
