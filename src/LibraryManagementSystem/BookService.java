package LibraryManagementSystem;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class BookService {
     List<Book> books;


    public boolean checkIfBookIsAvailable(String field,SearchStartegy startegy){
        //Search for status and check accordingly
        this.books = startegy.search(field);
        return books.isEmpty();
    }

    public Book loanABook(){
        // Updates the book status and return date of book and returns that book
        return new Book(UUID.randomUUID(),"Demo","Demo", Date.from(Instant.now()),"Occupied",Date.from(Instant.now()));
    }

    public Book returnABook(){
        // Update the Status of the book accordingly
        return new Book(UUID.randomUUID(),"Demo","Demo", Date.from(Instant.now()),"Occupied",Date.from(Instant.now()));
    }

}
