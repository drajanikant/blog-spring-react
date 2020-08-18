package in.codecrescendo.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codecrescendo.blog.entity.Post;
import in.codecrescendo.blog.service.IPostService;
import in.codecrescendo.blog.wrapper.input.PostInputWrapper;

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
	
	@PostMapping
	public Post savePost(@RequestBody PostInputWrapper post)
	{
		return postService.savePost(post);
	}
	
	
	@PutMapping(value = "/{post}")
	public Post updatePost(@PathVariable int postId, @RequestBody PostInputWrapper postObj)
	{
		return postService.updateByID(postId, postObj);
	}
	
	@DeleteMapping(value = "/{postId}")
	public void deleteById(@PathVariable int postId) throws Exception
	{
		postService.deleteById(postId);
	}
	
	
	@GetMapping(value = "/{postId}")
		public Post findById(@PathVariable int postId) throws Exception
		{
			return postService.findById(postId);
		}
	
	
	}


