	package in.codecrescendo.blog.service;

import in.codecrescendo.blog.dao.UserRepository;
import in.codecrescendo.blog.wrapper.input.PostInputWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codecrescendo.blog.dao.PostRepository;
import in.codecrescendo.blog.entity.Post;

import java.util.Date;

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
		newPost.setpostTitle(post.getPost_title());
		newPost.setpostBody(post.getPost_body());
		newPost.setuserId(userRepository.findById(post.getUser_id()).get());
		newPost.setcreatedAt(new Date());
		newPost.setmodifiedAt(new Date());
		newPost.setIsDraft(1);
		return postRepository.save(newPost);
	}
	
	
}
