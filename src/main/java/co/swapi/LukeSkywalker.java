package co.swapi;

import models.People;
import models.Planet;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertTrue;

public class LukeSkywalker {

    @Test
    public void checkLukeSkywalker() {
        RestTemplate restTemplate = new RestTemplate();
        People people = restTemplate.getForObject("https://swapi.co/api/people/1/", People.class);

        System.out.println("Check if persons name is Luke Skywalker");
        System.out.print("The name is:" + people.getName());
        System.out.print("The planet is:" + people.getHomeworld());
        assertTrue(people.getName().equals("Luke Skywalker"));
        assertTrue(people.getUrl().equals("https://swapi.co/api/people/1/"));

    }

    @Test
    public void checkThePlanet() {
        RestTemplate restTemplate = new RestTemplate();
        People people = restTemplate.getForObject("https://swapi.co/api/people/1/", People.class);
        Planet planet = restTemplate.getForObject(people.getHomeworld(), Planet.class);

        System.out.println("Check if Luke Skywalkers homeworld is Tatooina");
        System.out.print("The planets name is:" + planet.getName());
        System.out.print("The population is:" + planet.getPopulation());
        assertTrue(planet.getName().equals("Tatooine"));
        assertTrue(planet.getPopulation().equals("200000"));
    }
}