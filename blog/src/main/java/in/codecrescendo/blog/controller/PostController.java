package in.codecrescendo.blog.controller;

import in.codecrescendo.blog.wrapper.input.PostInputWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codecrescendo.blog.entity.Post;
import in.codecrescendo.blog.service.IPostService;

@RestController
@RequestMapping(value = "/api")

public class PostController {
	
	@Autowired
	private IPostService postService;
	
	@GetMapping("/hello")
	public String hi()
	{
		return "Hello";
	}
	
	@PostMapping(value = "/posts")
	public Post savePost(@RequestBody PostInputWrapper post)
	{
		return postService.savePost(post);
	}

}
