package StackOverFlow;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Comment {
    UUID commentId;
    String comment;
    User user;
    Date createdAt;
    UUID parentId; // Whether the comment belongs to answer or question

    Comment(String comment,User user,UUID parentId){
        this.comment = comment;
        this.user = user;
        this.parentId = parentId;
        this.commentId = UUID.randomUUID();
        this.createdAt = Date.from(Instant.from(Instant.now()));
    }

    void addComment(){
        // Logic for adding Comment
    }
}
