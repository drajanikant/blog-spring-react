package in.codecrescendo.blog.wrapper.input;

public class PostInputWrapper {

    private String post_title;

    private Integer user_id;

    private String post_body;

	public int getPost_id;

    public PostInputWrapper() {
        this.post_title = "";
        this.user_id = 0;
        this.post_body = "";
    }

    public PostInputWrapper(String post_title, Integer user_id, String post_body) {
        this.post_title = post_title;
        this.user_id = user_id;
        this.post_body = post_body;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getPost_body() {
        return post_body;
    }

    public void setPost_body(String post_body) {
        this.post_body = post_body;
    }
}
