package com.codingshuttle.Aryan.prod_ready_features.client;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class UserClient {

    Logger log = LoggerFactory.getLogger(UserClient.class);

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

        log.error("error log");
        log.debug("debug log");
        log.warn("warn log");
        log.info("info log");
        log.trace("trace log");


        String userInformation =  restClient
                .get()
                .uri("/users/{id}",id)
                .retrieve()
                .body(String.class);

        log.info("successfully got the userInformation {}",userInformation);

        return userInformation;
    }

}
