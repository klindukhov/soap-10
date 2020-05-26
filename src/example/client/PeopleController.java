
package example.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PeopleController", targetNamespace = "http://Server.example/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PeopleController {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<example.client.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPeople", targetNamespace = "http://Server.example/", className = "example.client.GetPeople")
    @ResponseWrapper(localName = "getPeopleResponse", targetNamespace = "http://Server.example/", className = "example.client.GetPeopleResponse")
    @Action(input = "http://Server.example/PeopleController/getPeopleRequest", output = "http://Server.example/PeopleController/getPeopleResponse")
    public List<Person> getPeople(
        @WebParam(name = "arg0", targetNamespace = "")
        Filter arg0);

}
