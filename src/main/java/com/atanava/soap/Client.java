package com.atanava.soap;

import jakarta.xml.ws.Binding;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.Handler;
import java.util.List;

public class Client {

    private final EQuest port;

    public Client(EQuest port) {
        this.port = port;
    }

    public List<PostingType> getPostings(String username, String password, String requisition) {

        return port.getPostings(username, password, requisition);
    }
}
