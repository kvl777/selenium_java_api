package models;

public class People {
    private String url;

  public People() {}

    public People(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "People{" +
                "url='" + url + '\'' +
                '}';
    }
}
