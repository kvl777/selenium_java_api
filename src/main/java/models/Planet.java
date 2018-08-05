package models;

public class Planet {
    private String url;
    private String name;
    private String population;
    private String films;

    public Planet() {}

    public Planet(String url, String name, String population, String films) {
        this.url = url;
        this.name = name;
        this.population = population;
        this.films = films;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", films='" + films + '\'' +
                '}';
    }
}
