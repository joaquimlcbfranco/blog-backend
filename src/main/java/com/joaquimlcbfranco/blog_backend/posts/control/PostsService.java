package com.joaquimlcbfranco.blog_backend.posts.control;

import com.joaquimlcbfranco.blog_backend.posts.entity.PostBE;
import com.joaquimlcbfranco.blog_backend.posts.entity.PostsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    public List<PostBE> getAllPosts() {
        return this.postsRepository.findAll();
    }
}
