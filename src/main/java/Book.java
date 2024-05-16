public class Book extends Media {

    private String author;

    public Book(String title, String author, double price){
       super(title, price);
       this.author = author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public String storyline(){
        return "This is the storyline of the book " + getTitle() + " by " + author + ".";
    }

}
