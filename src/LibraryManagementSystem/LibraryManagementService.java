package LibraryManagementSystem;

public class LibraryManagementService {
    UserService userService;
    BookService bookService;
    //FineCalculation Service
    //Admin serice for different type of user

    LibraryManagementService(){
        userService = new UserService();
        bookService = new BookService();
    }

    public void handleBooking(){
           userService.setUser("shaktitripathi02@gmail.com",new SearchUserByEmail());
           boolean isBookAvailable = bookService.checkIfBookIsAvailable("Demo",new SearchByTitle()); // Can be provided by the user
           if(isBookAvailable){
               Book newBook = bookService.loanABook();
               userService.updateHistory(newBook);
           }
           else{
               System.out.println("Sorry no books available for loaning");
           }

    }

    public void handleReturnOfBook(){
        userService.setUser("shaktitripathi02@gmail.com",new SearchUserByEmail());
       Book oldBook = bookService.returnABook();
       userService.updateHistory(oldBook);
       //Calculation of Fine if Possible
    }
}
