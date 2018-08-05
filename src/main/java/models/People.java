package models;

public class People {
    private String url;
    private String name;
    private String homeworld;

    public  People() {

    }

    public People(String url, String name, String homeworld) {
        this.url = url;
        this.name = name;
        this.homeworld = homeworld;
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

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    @Override
    public String toString() {
        return "People{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", homeworld='" + homeworld + '\'' +
                '}';
    }
}
