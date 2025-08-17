package StackOverFlow;

import java.util.List;

import java.util.UUID;

public class StackOverFlow {
     List<User> users;
     List<Question> questions;
     List<Tag> tags;
     List<Answer> answers;

     void createUser(String name,String email){

     }
     void addQuestion(String questionText, UUID userId, List<Tag> tags ){

     }

     void postAnswer(UUID questionId,UUID userId,String answerText){

     }

     void addComment(String comment,UUID parentPostId){

     }

     void vote(VoteType voteType,UUID parentPostId){

     }

}
