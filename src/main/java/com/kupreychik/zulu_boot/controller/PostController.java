/*
package com.kupreychik.zulu_boot.controller;

import com.kupreychik.zulu_boot.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
@ConditionalOnProperty(value = "jsonplaceholder.enabled", havingValue = "true")
public class PostController {

    private final PostService postService;

    @GetMapping
    public String getPosts() {
        return postService.getPosts();
    }
}
*/
