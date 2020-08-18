package in.codecrescendo.blog.controller;

import in.codecrescendo.blog.entity.User;
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

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/posts")
public class PostController {
	
	@Autowired
	private IPostService postService;
	
	@PostMapping
	public Post savePost(@RequestBody PostInputWrapper post)
	{
		return postService.savePost(post);
	}
	
	
	@PutMapping(value = "/{post_id}")
	public Post updatePost(@PathVariable(value = "post_id") int postId, @RequestBody PostInputWrapper postObj) throws Exception {
		return postService.updateByID(postId, postObj);
	}
	
	@DeleteMapping(value = "/{post_id}")
	public void deleteById(@PathVariable(value = "post_id") int postId) throws Exception
	{
		postService.deleteById(postId);
	}

	@GetMapping(value = "/{postId}")
	public Post findById(@PathVariable(value = "postId") int postId) throws Exception
	{
		return postService.findById(postId);
	}

	@GetMapping
	public List<Post> getAllPosts() throws Exception {
		return postService.getAllPosts();
	}

}


