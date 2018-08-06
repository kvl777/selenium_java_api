package models;

public class Planet {

    private String name;
    private String population;
    private String films;

    public Planet() {}

    public Planet(String name, String population, String films) {
        this.name = name;
        this.population = population;
        this.films = films;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getFilms() {
        return films;
    }

    public void setFilms(String films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", films='" + films + '\'' +
                '}';
    }
}
