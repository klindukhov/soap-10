package example.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;


class PeopleControllerClientTest {

    private static PeopleController peopleController;

    @BeforeAll
    static void beforeAll(){
        PeopleController_Service peopleController_service = new PeopleController_Service();
        peopleController = peopleController_service.getPeopleController();
    }

    @Test
    void getPeople() {
        List<Person> people = peopleController.getPeople(new Filter());
    }
    @Test
    void getPeopleBySurname() {
        List<Person> people = peopleController.getPeople(new Filter());
    }
    @Test
    void getPeopleByBirthdate() {
        List<Person> people = peopleController.getPeople(new Filter());
    }
    @Test
    void getAllPeople() {
        List<Person> people = peopleController.getPeople(new Filter());
        Assertions.assertEquals(5, people.size());
    }
}