package example.Server;

import Models.Filter;
import Models.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

class PeopleControllerTest {

    @Test
    void getPeople() {
        PeopleController pc = new PeopleController();
        List<Person> ppl = new ArrayList<>();
        ppl.add(new Person("John", "Doe", new GregorianCalendar(2000, Calendar.JUNE, 3).getTime()));
        Assertions.assertEquals(ppl, pc.getPeople(new Filter("Doe", new GregorianCalendar(2000, Calendar.JUNE, 3).getTime())));
    }
    @Test
    void getPeopleBySurname() {
        PeopleController pc = new PeopleController();
        List<Person> ppl = new ArrayList<>();
        ppl.add(new Person("John", "Doe", new GregorianCalendar(2000, Calendar.JUNE, 3).getTime()));
        ppl.add(new Person("Michael", "Doe", new GregorianCalendar(1999, Calendar.DECEMBER, 9).getTime()));
        Assertions.assertEquals(ppl, pc.getPeople(new Filter("Doe", null)));
    }
    @Test
    void getPeopleByBirthdate() {
        PeopleController pc = new PeopleController();
        List<Person> ppl = new ArrayList<>();
        ppl.add(new Person("John", "Doe", new GregorianCalendar(2000, Calendar.JUNE, 3).getTime()));
        Assertions.assertEquals(ppl, pc.getPeople(new Filter(null, new GregorianCalendar(2000, Calendar.JUNE, 3).getTime())));
    }
    @Test
    void getAllPeople() {
        PeopleController pc = new PeopleController();
        List<Person> ppl = new ArrayList<>();
        ppl.add(new Person("John", "Doe", new GregorianCalendar(2000, Calendar.JUNE, 3).getTime()));
        ppl.add(new Person("Matt", "Smith", new GregorianCalendar(1986, Calendar.JUNE, 6).getTime()));
        ppl.add(new Person("David", "Tennant", new GregorianCalendar(2006, Calendar.AUGUST, 2).getTime()));
        ppl.add(new Person("Michael", "Doe", new GregorianCalendar(1999, Calendar.DECEMBER, 9).getTime()));
        ppl.add(new Person("Franklin", "Richards", new GregorianCalendar(1994, Calendar.MARCH, 29).getTime()));
        Assertions.assertEquals(ppl, pc.getPeople(new Filter()));
    }
}