package com.link.nest.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.link.nest.app.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
