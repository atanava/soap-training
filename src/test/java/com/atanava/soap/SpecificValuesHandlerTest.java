package com.atanava.soap;

import jakarta.xml.ws.Binding;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.Handler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

@Disabled
class SpecificValuesHandlerTest {

    private SpecificValuesHandler handler;

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    void init() {
        System.setOut(new PrintStream(output));
        handler = new SpecificValuesHandler();
    }

    @AfterEach
    void destroy() {
        System.setOut(null);
    }

    @Test
    void handleMessage() {
        //test with custom message
    }

    @Test
    void handlePortMessage() {
        String username = "some username";
        String password = "some password";
        String requisition = "some requisition";

        EQuestServiceService service = new EQuestServiceService();
        EQuest port = service.getEQuestServicePort();

        BindingProvider bp = (BindingProvider) port;
        Binding binding = bp.getBinding();
        List<Handler> handlerChain = List.of(new SpecificValuesHandler());
        binding.setHandlerChain(handlerChain);

        //test with port message
    }
}