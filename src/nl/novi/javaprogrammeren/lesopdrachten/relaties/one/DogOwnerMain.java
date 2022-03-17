package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwnerMain {

    /*
    Opdracht
    Geef de klasse Dog de volgende instance variables: name, species, age, sex. Datatypes mag je zelf verzinnen.
    De sex en species variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse DogOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie: Een DogOwner kan maximaal 1 Dog hebben. De DogOwner is in dit geval de eigenaar.
    De DogOwner-klasse moet methodes bevatten om de naam van de hond aan te passen én de leeftijd met 1 te verhogen.

    Geef de DogOwner een toString()-methode en druk dit af:
    NAAM-DogOwner heeft een reu/teef, deze is xx jaar oud en van het soort: SOORT-Dog. De hond heet: NAAM-Dog

    Instantieer hieronder de objecten en laat zien dat je code werkt.
     */

    public static void main(String[] args) {
        Dog vicky = new Dog("Vicky", "teckel", 5, "teef");
        DogOwner harry = new DogOwner("Harry", "man");
        harry.setDog(vicky);
        System.out.println(harry.getDog().getName() + harry.getDog().getAge());
        System.out.println(harry.getDog().getAge());
        System.out.println(harry.getName() + " heeft een " + harry.getDog().getSex() + ", deze is " + harry.getDog().getAge() + " jaar oud en van het soort: " + harry.getDog().getSpecies() + ". De hond heet: " + harry.getDog().getName());
        harry.changeDogName("Vikki");
        System.out.println(vicky.getName());
        harry.happyBirthdayToDog();
        System.out.println(vicky.getAge());
        harry.printString();
    }

}
