package example.Server;
import Models.Filter;
import Models.Person;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@WebService()
public class PeopleController {
  private static ArrayList<Person> list = new ArrayList<>();

   static {
    list.add(new Person("John", "Doe", new GregorianCalendar(2000, Calendar.JUNE, 3).getTime()));
    list.add(new Person("Matt", "Smith", new GregorianCalendar(1986, Calendar.JUNE, 6).getTime()));
    list.add(new Person("David", "Tennant", new GregorianCalendar(2006, Calendar.AUGUST, 2).getTime()));
    list.add(new Person("Michael", "Doe", new GregorianCalendar(1999, Calendar.DECEMBER, 9).getTime()));
    list.add(new Person("Franklin", "Richards", new GregorianCalendar(1994, Calendar.MARCH, 29).getTime()));
  }

  @WebMethod
  public List<Person> getPeople(Filter filter) {
     List<Person> result= new ArrayList<>();
    for (Person person : list) {
        if(filter.getBirthdate() != null && !person.getBirthdate().equals(filter.getBirthdate())) continue;
        if(filter.getSurname() != null && !person.getSurname().equals(filter.getSurname())) continue;
        result.add(person);

    }
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new PeopleController();
    String address = "http://localhost:8080/services/example/Server/PeopleController";
    Endpoint.publish(address, implementor);
  }
}
