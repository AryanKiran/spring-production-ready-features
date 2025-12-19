package com.codingshuttle.Aryan.prod_ready_features.controllers;

import com.codingshuttle.Aryan.prod_ready_features.client.UserClient;
import com.codingshuttle.Aryan.prod_ready_features.dto.PostDTO;
import com.codingshuttle.Aryan.prod_ready_features.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;


    @GetMapping("/restClient/{id}")
    public String getUserDetails(@PathVariable Long id){
        return postService.getUserDetails(id);
    }

    @GetMapping
    public List<PostDTO> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public PostDTO getPostById(@PathVariable Long postId) {
        return postService.getPostById(postId);
    }

    @PostMapping
    public PostDTO createNewPost(@RequestBody PostDTO inputPost) {
        return postService.createNewPost(inputPost);
    }

}
