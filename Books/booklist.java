package Books;
import java.util.*;
public class booklist extends bookinfo {

   private List<bookinfo>bookList = new ArrayList<>();
   static Scanner scan = new Scanner(System.in);
    static String TITLE,  AUTHOR,  SUMMARY;
    
    public booklist() {
        super(TITLE, AUTHOR, SUMMARY);
    }

    public bookinfo addPatients(){
        System.out.print("Enter Title: ");
        TITLE = scan.nextLine();
        System.out.print("Enter Author: ");
        AUTHOR = scan.nextLine();
        System.out.println("Enter Summary: ");
        SUMMARY = scan.nextLine();

        bookinfo bookss = new bookinfo(TITLE, AUTHOR, SUMMARY);
        bookList.add(bookss);
        System.out.println("SUCCESS!");
        return bookss;
    }
    
    public void Print(){
        for(bookinfo books : bookList){
            System.out.print("Title: " + books.getTitle()
            +"\nAuthor: " + books.getAuthor()
            +"\nSummary: " + books.getSummary()
            +"\n\n");
        }
    }

    public void RunMe(){
        while(true){
            System.out.println("Enter Choice: ");
            int choose = scan.nextInt();
            scan.nextLine();
            switch(choose){
                case 1: addPatients(); break;
                case 2: Print(); break;
                case 3: System.exit(0);
            }
        }
    }
}
