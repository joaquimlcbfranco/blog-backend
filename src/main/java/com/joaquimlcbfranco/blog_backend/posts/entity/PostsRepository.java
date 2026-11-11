package com.joaquimlcbfranco.blog_backend.posts.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<PostBE, Long> {}
