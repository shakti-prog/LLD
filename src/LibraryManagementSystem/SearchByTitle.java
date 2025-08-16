package LibraryManagementSystem;

import java.util.List;

public class SearchByTitle implements SearchStartegy {
    @Override
    public List<Book> search(String field) {
        System.out.println(field);
        return List.of();
    }
}
