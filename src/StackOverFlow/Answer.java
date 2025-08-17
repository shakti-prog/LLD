package StackOverFlow;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Answer {
    UUID answerId;
    String answerText;
    List<Comment> comments;
    List<Vote> votes;
    Date createdAt;
    User user;
    boolean isAccepted;
    Question question;

    Answer(String answerText,User user,Question question){
        this.answerText = answerText;
        this.question = question;
        this.user = user;
        this.createdAt = Date.from(Instant.from(Instant.now()));
        this.isAccepted = false;
    }

    void addComment(User user,String text){

    }
    void upVote(User user,VoteType voteType){

    }
    void markAsAccepted(){

    }
}
