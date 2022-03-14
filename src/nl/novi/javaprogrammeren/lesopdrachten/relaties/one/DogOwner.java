package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {
    private String name;
    private String sex;
    // private Dog dog of private String dog?
    private Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    // Getters

    public String getName() { return name; }

    public String getSex() { return sex; }

    public Dog getDog() { return dog; }

    // Setters
    // Moeten deze setters wel aangezien je de naam en sexe van een persoon over het algemeen niet verandert?

    public void setName(String name) { this.name = name; }

    public void setSex(String sex) { this.sex = sex; }

    public void setDog(Dog dogName) { this.dog = dogName;}

    // Methodes

    public void changeDogName(String newName) {
        // of moet het niet met setdog
        // Hoe zorg ik ervoor dat alleen de eigenaar de naam aan kan passen?
        dog.setName(newName);

    }

    public void happyBirthdayToDog(int age) {
        // tussen haakjes moet denk ik de naam van de hond komen te staan
        // Huidige leeftijd van de hond ophalen
        // De huidige leeftijd verhogen met 1
        age++;
    }

    public void toString(String dogOwner) {
        // Hoe kom ik vanuit hier aan de naam van de dogowner en zijn dog?
        System.out.println();

    }

}
