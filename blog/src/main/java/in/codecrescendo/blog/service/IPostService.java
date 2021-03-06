package in.codecrescendo.blog.service;

import in.codecrescendo.blog.entity.Post;
import in.codecrescendo.blog.wrapper.input.PostInputWrapper;

import java.util.List;

public interface IPostService {
	Post savePost(PostInputWrapper post);
	
	Post updateByID(int postId, PostInputWrapper postObj) throws Exception;
	
	Post deleteById(int postId) throws Exception;
	
	Post findById(int postId) throws Exception;
	
	List<Post> findByTitle(String postTitle) throws Exception;

	List<Post> getAllPosts() throws Exception;

}
