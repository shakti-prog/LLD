package LibraryManagementSystem;

public class UserService {
    User user;

    public void setUser(String field,SearchUserInterface strategy) {
        this.user = strategy.searchUser(field);
    }

    public void getUserHistory(){
        System.out.println(user.history);
    }

    public void updateHistory(Book newBook){
        // Logic
    }
}
