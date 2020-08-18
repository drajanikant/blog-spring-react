package in.codecrescendo.blog.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codecrescendo.blog.dao.PostRepository;
import in.codecrescendo.blog.dao.UserRepository;
import in.codecrescendo.blog.entity.Post;
import in.codecrescendo.blog.wrapper.input.PostInputWrapper;

@Service
public class PostService implements IPostService {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private UserRepository userRepository;
	@Override
	public Post savePost(PostInputWrapper post)
	{
		Post newPost = new Post();
		//newPost.setpostId(post.getPost_id);
		newPost.setpostTitle(post.getPost_title());
		newPost.setpostBody(post.getPost_body());
		newPost.setUser(userRepository.findById(post.getUser_id()).get());
		newPost.setcreatedAt(new Date());
		newPost.setmodifiedAt(new Date());
		newPost.setIsDraft(1);
		return postRepository.save(newPost);
	}
	
	
	
	@Override
	public Post updateByID(int postId, PostInputWrapper postObj) {
		Post newPost = new Post();
		newPost.setpostId(postObj.getPost_id);
		newPost.setpostTitle(postObj.getPost_title());
		newPost.setpostBody(postObj.getPost_body());
		newPost.setUser(userRepository.findById(postObj.getUser_id()).get());
		newPost.setcreatedAt(new Date());
		newPost.setmodifiedAt(new Date());
		newPost.setIsDraft(1);
		return postRepository.save(newPost);
	}



	@Override
	public Post deleteById(int postId) throws Exception {
		Optional<Post> post = postRepository.findById(postId);
		if(post.isPresent())
		{
			return post.get();
		}
		else
		{
			throw new Exception("Post not Found");
		}
		
	}



	@Override
	public Post findById(int postId) throws Exception {
		Optional<Post> post = postRepository.findById(postId);
		if(post.isPresent())
		{
			return post.get();
		}
		else
		{
			throw new Exception("Post not found");
		}
		
	}



	@Override
	public Post findByTitle(String postTitle) {
		
		return postRepository.findByTitle(postTitle);
	}

	
		

		
		


		




		
	


		
	

}