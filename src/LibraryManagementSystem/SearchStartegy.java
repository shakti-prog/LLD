package LibraryManagementSystem;

import java.util.List;

public interface SearchStartegy {
    public List<Book> search(String field);
}
