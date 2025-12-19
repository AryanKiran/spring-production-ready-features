package com.codingshuttle.Aryan.prod_ready_features.client;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class UserClient {

    //constructor injection
    private final RestClient restClient;

    public UserClient(RestClient restClient) {
        this.restClient = restClient;
    }

    /*production level UserClient
    UserDto user =
    restClient
        .get()
        .uri("/users/{id}", userId)
        .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
        .retrieve()
        .body(UserDto.class);

     */
    public String getUserById(Long id){

        return restClient
                .get()
                .uri("/users/{id}",id)
                .retrieve()
                .body(String.class);
    }

}
