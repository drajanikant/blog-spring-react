package in.codecrescendo.blog.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog_post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "post_id")
	private int post_id;
	
	@Column(name = "post_title")
	private String post_title;
	
	@Column(name ="user_id")
	private int user_id;
	
	@Column(name = "post_body")
	private String post_body;
	
	@Column(name = "created_at")
	private Date created_at;
	
	@Column(name = "modified_at")
	private Date modified_at;
	
	@Column(name = "is_draft")
	private String is_draft;
	
	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPost_body() {
		return post_body;
	}
	public void setPost_body(String post_body) {
		this.post_body = post_body;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getModified_at() {
		return modified_at;
	}
	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}
	public String getIs_draft() {
		return is_draft;
	}
	public void setIs_draft(String is_draft) {
		this.is_draft = is_draft;
	}
	
	
}
