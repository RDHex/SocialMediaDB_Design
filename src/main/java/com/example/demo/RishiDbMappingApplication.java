package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.entity.repo.PostRepo;
import com.example.demo.entity.repo.UserRepo;

@SpringBootApplication
public class RishiDbMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RishiDbMappingApplication.class, args);
	}

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		
		/*Post post = new Post("hello members", "greeting through our first post");
		
		Comment c1 = new Comment("good");
		Comment c2 = new Comment("better");
		Comment c3 = new Comment("best");
		
		post.getComments().add(c1);
		post.getComments().add(c2);
		post.getComments().add(c3);
		
		this.postRepo.save(post);*/
	}
}
