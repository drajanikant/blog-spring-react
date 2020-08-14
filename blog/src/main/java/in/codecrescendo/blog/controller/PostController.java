package in.codecrescendo.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codecrescendo.blog.entity.Post;
import in.codecrescendo.blog.service.PostServiceImpl;

@RestController
@RequestMapping(value = "/api")

public class PostController {
	
	@Autowired
	private PostServiceImpl postServiceImpl;
	
	@GetMapping("/hello")
	public String hi()
	{
		return "Hello";
	}
	
	@PostMapping(value = "/posts")
	public Post savePost(@RequestBody Post post)
	{
		return postServiceImpl.savePost(post);
	}

}
