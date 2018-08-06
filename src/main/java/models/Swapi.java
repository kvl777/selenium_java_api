package models;

public class Swapi {
    private String people;

    public Swapi () {}

    public Swapi(String people) {
        this.people = people;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Swapi{" +
                "people='" + people + '\'' +
                '}';
    }
}
