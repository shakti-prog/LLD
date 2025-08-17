package StackOverFlow;

import java.util.UUID;

public class Tag {
    UUID tagId;
    String tagName;

    Tag(String name){
        tagName = name;
        tagId = UUID.randomUUID();
    }
}
