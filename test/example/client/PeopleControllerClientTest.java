package example.client;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
        Filter filter = new Filter();
        filter.setBirthdate( new XMLGregorianCalendarImpl(new GregorianCalendar(2000, Calendar.JUNE, 3)));
        filter.setSurname("Doe");
        List<Person> people = peopleController.getPeople(filter);
        Assertions.assertEquals(1, people.size());
        Assertions.assertEquals("John", people.get(0).firstName);
        Assertions.assertEquals("Doe", people.get(0).surname);
        Assertions.assertEquals(new XMLGregorianCalendarImpl(new GregorianCalendar(2000, Calendar.JUNE, 3)), people.get(0).birthdate);
    }
    @Test
    void getPeopleBySurname() {
        Filter filter = new Filter();
        filter.setSurname("Doe");
        List<Person> people = peopleController.getPeople(filter);
        Assertions.assertEquals(2, people.size());
        Assertions.assertEquals("John", people.get(0).firstName);
        Assertions.assertEquals("Doe", people.get(0).surname);
        Assertions.assertEquals(new XMLGregorianCalendarImpl(new GregorianCalendar(2000, Calendar.JUNE, 3)), people.get(0).birthdate);
        Assertions.assertEquals("Michael", people.get(1).firstName);
        Assertions.assertEquals("Doe", people.get(1).surname);
        Assertions.assertEquals(new XMLGregorianCalendarImpl(new GregorianCalendar(1999, Calendar.DECEMBER, 9)), people.get(1).birthdate);

    }
    @Test
    void getPeopleByBirthdate() {
        Filter filter = new Filter();
        filter.setBirthdate( new XMLGregorianCalendarImpl(new GregorianCalendar(2000, Calendar.JUNE, 3)));
        List<Person> people = peopleController.getPeople(filter);
        Assertions.assertEquals(1, people.size());
        Assertions.assertEquals("John", people.get(0).firstName);
        Assertions.assertEquals("Doe", people.get(0).surname);
        Assertions.assertEquals(new XMLGregorianCalendarImpl(new GregorianCalendar(2000, Calendar.JUNE, 3)), people.get(0).birthdate);
    }
    @Test
    void getAllPeople() {
        List<Person> people = peopleController.getPeople(new Filter());
        Assertions.assertEquals(5, people.size());
    }
}