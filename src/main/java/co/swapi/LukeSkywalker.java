package co.swapi;

import models.People;
import models.Person;
import models.Planet;
import models.Swapi;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertTrue;

public class LukeSkywalker {

    @Test
    public void findLukeSkywalker() {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("Open the list of peoples");
        Swapi swapi = restTemplate.getForObject("https://swapi.co/api/", Swapi.class);

        System.out.println("Find first person in the list");
        People[] people = restTemplate.getForObject(swapi.getPeople(), People[].class);

        System.out.println("Check if first person in the list is Luke Skywalker");
        Person person = restTemplate.getForObject(people[0].getUrl(), Person.class);
        System.out.print("The name is:" + person.getName());
        assertTrue(person.getName().equals("Luke Skywalker"));
    }



}