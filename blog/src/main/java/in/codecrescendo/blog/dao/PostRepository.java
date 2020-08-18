package in.codecrescendo.blog.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.codecrescendo.blog.entity.Post;


@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
	
	
	public Post findbyId(@Param(value = "post_id")int postId);

		public Post findByTitle(String postTitle);

	

	
	
}
