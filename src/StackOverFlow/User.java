package StackOverFlow;

import java.util.UUID;

public class User {
      UUID userId;
      String name;
      String email;

    User(UUID userId,String name,String email){
        this.userId = userId;
        this.name = name;
        this.email = email;
    }
}
