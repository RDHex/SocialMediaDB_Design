package com.example.demo.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long>{

}
