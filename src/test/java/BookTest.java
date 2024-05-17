import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BookTest {

    private Book book;

    @BeforeEach
    public void setUp(){
        book = new Book("Harry Potter", "JK Rowling", 8.00);
    }

    @Test
    public void canSetTitle(){
        this.book.setTitle("Divergent");
        assertThat(book.getTitle()).isEqualTo("Divergent");
    }

    @Test
    public void canGetTitle(){
        assertThat(book.getTitle()).isEqualTo("Harry Potter");
    }

    @Test
    public void canSetPrice(){
        this.book.setPrice(7.50);
        assertThat(book.getPrice()).isEqualTo(7.50);
    }

    @Test
    public void canGetPrice(){
        assertThat(book.getPrice()).isEqualTo(8.00);
    }

    @Test
    public void canSetAuthor(){
        this.book.setAuthor("Jaqueline Wilson");
        assertThat(book.getAuthor()).isEqualTo("Jaqueline Wilson");
    }

    @Test
    public void canGetAuthor(){
        assertThat(book.getAuthor()).isEqualTo("JK Rowling");
    }

    @Test
    public void canShowStoryline(){
        String storyline = book.storyline();
        assertThat(storyline).isEqualTo("This is the storyline of the book Harry Potter by JK Rowling.");
    }

}