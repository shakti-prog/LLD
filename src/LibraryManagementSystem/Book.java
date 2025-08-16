package LibraryManagementSystem;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public class Book {
    UUID bookId;
    String title;
    String author;
    Date publishDate;
    String status;
    Date returnDate;

    Book(UUID bookId,String title,String author,Date publishDate,String status,Date returnDate){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.status = status;
        this.returnDate = returnDate;
    }
}


