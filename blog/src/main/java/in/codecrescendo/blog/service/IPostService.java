package in.codecrescendo.blog.service;

import in.codecrescendo.blog.entity.Post;
import in.codecrescendo.blog.wrapper.input.PostInputWrapper;

public interface IPostService {
	Post savePost(PostInputWrapper post);
	
	Post updateByID(int postId, PostInputWrapper postObj);
	
	Post deleteById(int postId) throws Exception;
	
	Post findById(int postId) throws Exception;
	
	Post findByTitle(String postTitle);
	

	
	
}
