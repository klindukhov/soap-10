
package example.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the example.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPeopleResponse_QNAME = new QName("http://Server.example/", "getPeopleResponse");
    private final static QName _GetPeople_QNAME = new QName("http://Server.example/", "getPeople");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: example.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPeopleResponse }
     * 
     */
    public GetPeopleResponse createGetPeopleResponse() {
        return new GetPeopleResponse();
    }

    /**
     * Create an instance of {@link GetPeople }
     * 
     */
    public GetPeople createGetPeople() {
        return new GetPeople();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.example/", name = "getPeopleResponse")
    public JAXBElement<GetPeopleResponse> createGetPeopleResponse(GetPeopleResponse value) {
        return new JAXBElement<GetPeopleResponse>(_GetPeopleResponse_QNAME, GetPeopleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeople }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server.example/", name = "getPeople")
    public JAXBElement<GetPeople> createGetPeople(GetPeople value) {
        return new JAXBElement<GetPeople>(_GetPeople_QNAME, GetPeople.class, null, value);
    }

}
