package com.atanava.soap;

import jakarta.jws.HandlerChain;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
@HandlerChain(file = "resources/handler.xml")
public class HandledService implements EQuest {

    @WebMethod
    @Override
    public List<PostingType> getPostings(String username, String password, String requisition) {
        EQuestServiceService service = new EQuestServiceService();
        EQuest client = service.getEQuestServicePort();

        List<PostingType> postings = client.getPostings(username, password, requisition);

        System.out.println(postings.size());

        return postings;
    }
}
