package in.codecrescendo.blog.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blog_post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "post_id")
	private int postId;
	
	@Column(name = "post_title")
	private String postTitle;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id", nullable=false)
	private User userId;
	
	@Column(name = "post_body")
	private String postBody;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "modified_at")
	private Date modifiedAt;
	
	@Column(name = "is_draft")
	private Integer isDraft;

	public Post() {
		this.postId = 0;
		this.postTitle = "";
		this.userId = null;
		this.postBody = "";
		this.createdAt = null;
		this.modifiedAt = null;
		this.isDraft = 0;
	}
	public Post(int postId, String postTitle, User userId, String postBody, Date createdAt, Date modifiedAt, Integer isDraft) {
		this.postId = postId;
		this.postTitle = postTitle;
		this.userId = userId;
		this.postBody = postBody;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.isDraft = isDraft;
	}

	public int getpostId() {
		return postId;
	}
	public void setpostId(int postId) {
		this.postId = postId;
	}
	public String getpostTitle() {
		return postTitle;
	}
	public void setpostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public User getuserId() {
		return userId;
	}
	public void setuserId(User userId) {
		this.userId = userId;
	}
	public String getpostBody() {
		return postBody;
	}
	public void setpostBody(String postBody) {
		this.postBody = postBody;
	}
	public Date getcreatedAt() {
		return createdAt;
	}
	public void setcreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getmodifiedAt() {
		return modifiedAt;
	}
	public void setmodifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Integer getIsDraft() {
		return isDraft;
	}

	public void setIsDraft(Integer isDraft) {
		this.isDraft = isDraft;
	}
}
