package in.codecrescendo.blog.service;

import in.codecrescendo.blog.entity.Post;
import in.codecrescendo.blog.wrapper.input.PostInputWrapper;

public interface IPostService {
	Post savePost(PostInputWrapper post);
}
