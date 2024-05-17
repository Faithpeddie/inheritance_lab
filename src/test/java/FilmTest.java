import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FilmTest {

    private Film film;

    @BeforeEach
    public void setUp(){
        film = new Film("The Hunger Games", "Gary Ross", 10.00);
    }

    @Test
    public void canSetTitle(){
        this.film.setTitle("Are We There Yet?");
        assertThat(film.getTitle()).isEqualTo("Are We There Yet?");
    }

    @Test
    public void canGetTitle(){
        assertThat(film.getTitle()).isEqualTo("The Hunger Games");
    }

    @Test
    public void canSetPrice(){
        this.film.setPrice(14.00);
        assertThat(film.getPrice()).isEqualTo(14.00);
    }

    @Test
    public void canGetPrice(){
        assertThat(film.getPrice()).isEqualTo(10.00);
    }
    @Test
    public void canSetDirector(){
        this.film.setDirector("Neil Burger");
        assertThat(film.getDirector()).isEqualTo("Neil Burger");
    }

    @Test
    public void canGetDirector(){
        assertThat(film.getDirector()).isEqualTo("Gary Ross");
    }

    @Test
    public void canPlayStoryline(){
        String storyline = film.storyline();
        assertThat(storyline).isEqualTo("This is the storyline of the film The Hunger Games by Gary Ross.");
    }

}
