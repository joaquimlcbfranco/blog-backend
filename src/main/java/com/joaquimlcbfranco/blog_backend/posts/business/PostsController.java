package com.joaquimlcbfranco.blog_backend.posts.business;

import com.example.blog.api.PostsApi;
import com.example.blog.api.model.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController implements PostsApi {

    @Override
    public ResponseEntity<List<Post>> getAllPosts() {
        return ResponseEntity.notFound().build();
    }
}
