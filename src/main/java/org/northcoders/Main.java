package org.northcoders;

import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.model.Data;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Data responseBody = FakeBooksDAO.webClientConnector();
        System.out.println(responseBody);
    }
}