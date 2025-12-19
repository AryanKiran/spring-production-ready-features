package com.codingshuttle.Aryan.prod_ready_features.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@Configuration
public class RestClientConfig {

    @Value("${RestService.base.url}")
    private String BASE_URL;

    @Bean
    @Qualifier("stringRestClient")
    RestClient getStringServiceRestClient() {
        return RestClient.builder()
                .baseUrl(BASE_URL)
                .build();
    }

/*
  Production level RestClient Bean creation.

  @Bean
    RestClient userRestClient(RestClient.Builder builder) {
        return builder
                .baseUrl("http://user-service")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

  */
}
