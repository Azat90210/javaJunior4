package homework;

public class Comments {
    private String comments;
    private int like;

    public Comments() {
    }

    public Comments(String comments, int like) {
        this.comments = comments;
        this.like = like;
    }

    public Comments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "comments='" + comments + '\'' +
                ", like=" + like +
                '}';
    }
}
