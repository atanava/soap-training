package com.atanava.soap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class ClientTest {

    private Client client;

    @BeforeEach
    void init() {
        String username = "some username";
        String password = "some password";
        String requisition = "some requisition";

        EQuestServiceService service = new EQuestServiceService();
        EQuest port = service.getEQuestServicePort();

        client = new Client(port);
    }

    @Test
    void getPostings() {
    }

}