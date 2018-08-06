package models;

public class Film {
    private String title;
    private String characters;
    private String planets;

    public Film() {}

    public Film(String title, String characters, String planets) {
        this.title = title;
        this.characters = characters;
        this.planets = planets;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getPlanets() {
        return planets;
    }

    public void setPlanets(String planets) {
        this.planets = planets;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", characters='" + characters + '\'' +
                ", planets='" + planets + '\'' +
                '}';
    }
}
