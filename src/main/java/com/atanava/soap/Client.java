package com.atanava.soap;

import jakarta.jws.HandlerChain;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.ws.WebServiceProvider;

import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.util.List;

//@WebService
//@HandlerChain(file = "resources/handler.xml")
public class Client implements EQuest {

    public static void main(String[] args) {

        String username = args[0];
        String password = args[1];
        String requisition = args[2];

        new Client().getPostings(username, password, requisition);
//        new HandledService().getPostings(username, password, requisition);

    }

    @Override
    public List<PostingType> getPostings(String username, String password, String requisition) {
        EQuestServiceService service = new EQuestServiceService();
        EQuest client = service.getEQuestServicePort();

        List<PostingType> postings = client.getPostings(username, password, requisition);

        postings.forEach(p -> {
            p.board.specificValues.forEach(v -> v.value = v.value.toUpperCase());
            String xmlString = null;
            try {
                JAXBContext context = JAXBContext.newInstance(PostingType.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                JAXBElement<PostingType> postingType =
                    new JAXBElement<>(new QName("", "postingType"), PostingType.class, p);

                StringWriter sw = new StringWriter();
                marshaller.marshal(postingType, sw);
                xmlString = sw.toString();
            } catch (JAXBException e) {
                e.printStackTrace();
            }
            System.out.println(xmlString);
        });

        return postings;
    }
}
