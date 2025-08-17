package StackOverFlow;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Vote {
     VoteType voteType;
     User user;
     UUID parentId; // Vote belongs to the question or answer
     Date createdAt;
     Vote(User user,VoteType voteType,UUID parentId){
         this.user = user;
         this.voteType = voteType;
         this.parentId = parentId;
         this.createdAt = Date.from(Instant.from(Instant.now()));
     }


     void  addVote(){
         // Logic
     }

}
