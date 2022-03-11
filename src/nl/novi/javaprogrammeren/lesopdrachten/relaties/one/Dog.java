package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class Dog {
    String name;
    String species;
    int age;
    String sex;

    public Dog(String name, String species, int age, String sex) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
    }

    public String getName() { return name; }

    public String getSpecies() { return species; }

    public int getAge() { return age; }

    public String getSex() { return sex; }

    public void setName(String name) { this.name = name; }

    public void setSpecies(String species) { this.species = species; }

    public void setAge(int age) { this.age = age; }

    public void setSex(String sex) { this.sex = sex; }

}
