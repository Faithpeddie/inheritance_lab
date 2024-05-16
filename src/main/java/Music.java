public class Music extends Media {

    private String genre;
    private String artist;

    public Music(String title, String artist, String genre, double price){
        super(title, price);
        this.artist = artist;
        this.genre = genre;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }

   public String playSong(){
        return "Now playing: " + getTitle() + " by " + artist + ".";
   }

}
