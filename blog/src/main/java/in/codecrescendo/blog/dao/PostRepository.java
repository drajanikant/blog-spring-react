package in.codecrescendo.blog.dao;

import in.codecrescendo.blog.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.codecrescendo.blog.entity.Post;

import java.util.List;


@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

    @Query("From Post as p where p.postTitle like :postTitle")
    List<Post> findByTitle(@Param(value = "postTitle") String postTitle);

}
