package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {
    String name;
    String sex;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() { return name; }

    public String getSex() { return sex; }

    public void setName(String name) { this.name = name; }

    public void setSex(String sex) { this.sex = sex; }

    public void changeDogName(String newName) {

    }

    public void happyBirthdayToDog(int age) {
        age++;
    }

}
