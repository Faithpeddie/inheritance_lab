import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MusicTest {

    private Music music;

    @BeforeEach
    public void setUp(){
        music = new Music("Saturn", "SZA", "Pop", 3.00);
    }

    @Test
    public void canSetArtist(){
        this.music.setArtist("Pop Smoke");
        assertThat(music.getArtist()).isEqualTo("Pop Smoke");
    }

    @Test
    public void canGetArtist(){
        assertThat(music.getArtist()).isEqualTo("SZA");
    }

    @Test
    public void canSetGenre(){
        this.music.setGenre("Rock");
        assertThat(music.getGenre()).isEqualTo("Rock");
    }

    @Test
    public void canGetGenre(){
        assertThat(music.getGenre()).isEqualTo("Pop");
    }

    @Test
    public void canPlaySong(){
        String playSong = music.playSong();
        assertThat(playSong).isEqualTo("Now playing: Saturn by SZA.");
    }

}
