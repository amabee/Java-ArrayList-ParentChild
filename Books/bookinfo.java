package Books;

public class bookinfo {
    private String title,author,summary;

    public bookinfo(String TITLE, String AUTHOR, String SUMMARY){
        this.title = TITLE;
        this.author = AUTHOR;
        this.summary = SUMMARY;
    }

    //SETTERS
    public String setTitle(String TITLE){
        this.title = TITLE;
        return this.title;
    }
    public String setAuthor(String AUTHOR){
        this.author = AUTHOR;
        return this.author;
    }
    public String setSummary(String SUMMARY){
        this.summary = SUMMARY;
        return this.summary;
    }
   
    //GETTER
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getSummary(){
        return this.summary;
    }
}
