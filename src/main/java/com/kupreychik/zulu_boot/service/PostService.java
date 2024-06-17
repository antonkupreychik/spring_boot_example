package com.kupreychik.zulu_boot.service;

import com.kupreychik.zulu_boot.config.JsonMockDataProperties;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@Slf4j
@RequiredArgsConstructor
@ConditionalOnProperty(value = "jsonplaceholder.enabled", havingValue = "true")
public class PostService {

    private final JsonMockDataProperties properties;

    @SneakyThrows
    public String getPosts() {
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(HttpRequest.newBuilder()
                .uri(URI.create(properties.getUrl() + properties.getPosts()))
                .GET()
                .build(), HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

}
