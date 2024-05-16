public class Film extends Media {

    private String director;

    public Film(String title, String director, double price){
        super(title, price);
        this.director = director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public String getDirector(){
        return this.director;
    }

    public String storyline(){
        return "This is the storyline of the film " + getTitle() + " by " + director + ".";
    }

}
