package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class EvenNumberSetTest {
    private EvenNumberSet set;
    @BeforeEach
    public void setUp(){
        set = new EvenNumberSet();
    }

    @Test
    public void testAdd(){
        assertTrue(set.add(2));
        assertTrue(set.add(4));
        assertFalse(set.add(3));
        assertFalse(set.add(5));
    }
    @Test
    public void testContains(){
        set.add(2);
        set.add(4);
        assertTrue(set.contains(2));
        assertTrue(set.contains(4));
        assertFalse(set.contains(3));
        assertFalse(set.contains(5));
    }
}
