
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _GetMessagesByDate_QNAME = new QName("http://service/", "getMessagesByDate");
    private final static QName _GetMessagesByDateResponse_QNAME = new QName("http://service/", "getMessagesByDateResponse");
    private final static QName _GetMessagesBySender_QNAME = new QName("http://service/", "getMessagesBySender");
    private final static QName _GetMessagesBySenderResponse_QNAME = new QName("http://service/", "getMessagesBySenderResponse");
    private final static QName _Message_QNAME = new QName("http://service/", "message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMessagesByDate }
     * 
     */
    public GetMessagesByDate createGetMessagesByDate() {
        return new GetMessagesByDate();
    }

    /**
     * Create an instance of {@link GetMessagesByDateResponse }
     * 
     */
    public GetMessagesByDateResponse createGetMessagesByDateResponse() {
        return new GetMessagesByDateResponse();
    }

    /**
     * Create an instance of {@link GetMessagesBySender }
     * 
     */
    public GetMessagesBySender createGetMessagesBySender() {
        return new GetMessagesBySender();
    }

    /**
     * Create an instance of {@link GetMessagesBySenderResponse }
     * 
     */
    public GetMessagesBySenderResponse createGetMessagesBySenderResponse() {
        return new GetMessagesBySenderResponse();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesByDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMessagesByDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getMessagesByDate")
    public JAXBElement<GetMessagesByDate> createGetMessagesByDate(GetMessagesByDate value) {
        return new JAXBElement<GetMessagesByDate>(_GetMessagesByDate_QNAME, GetMessagesByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesByDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMessagesByDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getMessagesByDateResponse")
    public JAXBElement<GetMessagesByDateResponse> createGetMessagesByDateResponse(GetMessagesByDateResponse value) {
        return new JAXBElement<GetMessagesByDateResponse>(_GetMessagesByDateResponse_QNAME, GetMessagesByDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesBySender }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMessagesBySender }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getMessagesBySender")
    public JAXBElement<GetMessagesBySender> createGetMessagesBySender(GetMessagesBySender value) {
        return new JAXBElement<GetMessagesBySender>(_GetMessagesBySender_QNAME, GetMessagesBySender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesBySenderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMessagesBySenderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getMessagesBySenderResponse")
    public JAXBElement<GetMessagesBySenderResponse> createGetMessagesBySenderResponse(GetMessagesBySenderResponse value) {
        return new JAXBElement<GetMessagesBySenderResponse>(_GetMessagesBySenderResponse_QNAME, GetMessagesBySenderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Message }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

}
