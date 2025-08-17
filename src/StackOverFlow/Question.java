package StackOverFlow;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Question {
    UUID questionId;
    String questionText;
    User user;
    List<Comment> comments;
    List<Tag> tags;
    List<Vote> votes;
    List<Answer> answers;
    Date createdAt;


    Question(String questionText,User user,List<Tag> tags){
        this.questionText = questionText;
        this.user = user;
        this.tags = tags;
        this.createdAt = Date.from(Instant.from(Instant.now()));
        questionId = UUID.randomUUID();
    }

    void addAnswer(Answer answer,User user){

    }
    void addComment(String text,User user){

    }

    void vote(VoteType voteType,User user){


    }
    void acceptAnswer(Answer answer){

    }


}
