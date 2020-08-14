package in.codecrescendo.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codecrescendo.blog.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
}
