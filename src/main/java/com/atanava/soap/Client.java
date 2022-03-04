package com.atanava.soap;

import jakarta.xml.ws.Binding;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.Handler;
import java.util.List;

public class Client {

    public List<PostingType> getPostings(String username, String password, String requisition) {
        EQuestServiceService service = new EQuestServiceService();
        EQuest port = service.getEQuestServicePort();

        BindingProvider bp = (BindingProvider) port;
        Binding binding = bp.getBinding();
        List<Handler> handlerChain = List.of(new SpecificValuesHandler());
        binding.setHandlerChain(handlerChain);

        return port.getPostings(username, password, requisition);
    }
}
