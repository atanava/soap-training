package com.atanava.soap;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.ws.LogicalMessage;
import jakarta.xml.ws.handler.LogicalHandler;
import jakarta.xml.ws.handler.LogicalMessageContext;
import jakarta.xml.ws.handler.MessageContext;

import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.util.List;

public class SpecificValuesHandler implements LogicalHandler<LogicalMessageContext> {

    @Override
    public boolean handleMessage(LogicalMessageContext ctx) {
        Boolean outboundProperty = (Boolean) ctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty) {
            System.out.println("\nOutbound message:");
        } else {
            System.out.println("\nInbound message:");
        }

        LogicalMessage msg = ctx.getMessage();

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Object payload = msg.getPayload(jaxbContext);

            if (payload instanceof GetPostingsResponse) {
                List<PostingType> postings = ((GetPostingsResponse) payload).getPosting();

                for (PostingType posting : postings) {
                    posting.board.specificValues.forEach(v -> v.value = v.value.toUpperCase());

                    JAXBContext context = JAXBContext.newInstance(PostingType.class);
                    Marshaller marshaller = context.createMarshaller();
                    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                    JAXBElement<PostingType> postingType =
                        new JAXBElement<>(new QName("", "postingType"), PostingType.class, posting);

                    StringWriter sw = new StringWriter();
                    marshaller.marshal(postingType, sw);

                    System.out.println(sw);
                }
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean handleFault(LogicalMessageContext logicalMessageContext) {
        return true;
    }

    @Override
    public void close(MessageContext messageContext) {

    }
}

