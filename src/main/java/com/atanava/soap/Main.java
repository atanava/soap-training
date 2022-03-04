package com.atanava.soap;

public class Main {

    public static void main(String[] args) {
        String username = args[0];
        String password = args[1];
        String requisition = args[2];

        new Client().getPostings(username, password, requisition);
    }
}
