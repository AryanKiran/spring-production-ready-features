package com.codingshuttle.Aryan.prod_ready_features.services;

import com.codingshuttle.Aryan.prod_ready_features.dto.PostDTO;

import java.util.List;

public interface PostService {

     String getUserDetails(Long orderId);

     List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long postId);
}
