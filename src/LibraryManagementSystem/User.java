package LibraryManagementSystem;

import java.util.List;
import java.util.UUID;

public class User {
    UUID userId;
    String name;
    String email;
    String phoneNumber;
    List<Book> history;
}
