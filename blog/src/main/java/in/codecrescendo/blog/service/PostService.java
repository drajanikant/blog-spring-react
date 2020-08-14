package in.codecrescendo.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codecrescendo.blog.dao.PostRepository;
import in.codecrescendo.blog.entity.Post;

@Service
public class PostService implements PostServiceImpl {

	@Autowired	
	private PostRepository postRepository;
	
	@Override
	public Post savePost(Post post)
	{
		Post po = new Post();
		po.setPost_id(post.getPost_id());
		po.setPost_title(post.getPost_title());
		po.setUser_id(post.getUser_id());
		po.setPost_body(post.getPost_body());
		po.setCreated_at(post.getCreated_at());
		po.setModified_at(post.getModified_at());
		po.setIs_draft(post.getIs_draft());
		return postRepository.save(post);
		
	}
	
	
}
