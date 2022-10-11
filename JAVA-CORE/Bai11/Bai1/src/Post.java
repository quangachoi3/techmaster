import java.util.Date;

public class Post {
    String title;
    String id;
    String description;
    String Content;
    Date lastUpdateAt;
    Date postedAt;

    public Post() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setLastUpdateAt(Date lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", Content='" + Content + '\'' +
                ", lastUpdateAt=" + lastUpdateAt +
                ", postedAt=" + postedAt +
                '}';
    }
}
