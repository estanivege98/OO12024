package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WallPostTest {
    WallPost wallPost;
    WallPost coolPost;

    @BeforeEach
    void setUp() throws Exception {
        wallPost = new WallPostImp();
        coolPost = new WallPostImp();
        coolPost.like();
        coolPost.like();
        coolPost.like();
        coolPost.like();
        coolPost.toggleFeatured();
    }

    @Test
    void testCreation(){
        assertEquals("Undefined post", wallPost.getText());
        assertEquals(0, wallPost.getLikes());
        assertEquals(false, wallPost.isFeatured());
    }
}
