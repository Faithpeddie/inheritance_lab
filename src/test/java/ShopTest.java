import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    void setUp(){
        shop = new Shop();
    }

    @Test
    public void canSetInventory(){
        ArrayList<Media> mediaList = new ArrayList<>();
        Media film = new Film("The Hunger Games", "Jennifer Lawrence", 12.00);
        Media music = new Music("Thinking Out Loud", "Ed Sheeran", "Blue-eyed soul", 10.00);
        mediaList.add(film);
        mediaList.add(music);
        shop.setInventory(mediaList);
        assertThat(shop.getInventory()).isEqualTo(mediaList);
    }

    @Test
    public void canGetInventory(){
        ArrayList<Media> mediaList = new ArrayList<>();
        Media film = new Film("The Hunger Games", "Jennifer Lawrence", 12.00);
        mediaList.add(film);
        shop.setInventory(mediaList);
        assertThat(shop.getInventory()).isEqualTo(mediaList);
    }

    @Test
    public void canAddMedia(){
        Media music = new Music("Crazy in Love", "Beyonce", "R&B", 5.00);
        shop.addMedia(music);
        assertThat(shop.countMedia()).isEqualTo(1);
    }

    @Test
    public void canCountMedia(){
        assertThat(shop.countMedia()).isEqualTo(0);
    }

}
