package com.atanava.soap;

import jakarta.xml.ws.Binding;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.Handler;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        EQuestServiceService service = new EQuestServiceService();
        EQuest port = service.getEQuestServicePort();

        BindingProvider bp = (BindingProvider) port;
        Binding binding = bp.getBinding();
        List<Handler> handlerChain = List.of(new SpecificValuesHandler());
        binding.setHandlerChain(handlerChain);

        String username = args[0];
        String password = args[1];
        String requisition = args[2];

        List<PostingType> postings = port.getPostings(username, password, requisition);
    }

}
