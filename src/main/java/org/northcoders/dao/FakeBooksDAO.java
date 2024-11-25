package org.northcoders.dao;

import org.northcoders.model.Data;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

public class FakeBooksDAO {


    public static Data webClientConnector(){
        WebClient client = WebClient.create("https://fakerapi.it/api/v1");
        Data responseBody = null;

        try {
            responseBody = client.get()
                    .uri("/books")
                    .retrieve()
                    .bodyToMono(Data.class)
                    .block();
            //System.out.println(responseBody);
            return responseBody;
        }catch (WebClientResponseException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
