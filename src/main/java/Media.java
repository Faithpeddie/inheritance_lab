public abstract class Media {

    protected String title;
    protected double price;

    public Media(String title, double price){
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

}
