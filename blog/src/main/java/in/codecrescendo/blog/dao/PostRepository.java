package in.codecrescendo.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codecrescendo.blog.entity.Post;



public interface PostRepository extends JpaRepository<Post, Integer>{


}
