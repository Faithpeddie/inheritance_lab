import java.util.ArrayList;

public class Shop {

    private ArrayList<Media> inventory;

    public Shop(){
        this.inventory = new ArrayList<>();
    }

    // setter
    public void setInventory(ArrayList<Media> inventory){
        this.inventory = inventory;
    }

    // getter
    public ArrayList<Media> getInventory(){
        return this.inventory;
    }

    // method
    public void addMedia(Media media){
        this.inventory.add(media);
    }

    // method
    public int countMedia(){
        if (inventory == null){
            return 0;
        }
        else{
            return inventory.size();
        }
    }

}
