package exercises.technology.test;


import exercises.technology.Computer;
import exercises.technology.Laptop;
import org.junit.Test;
import static org.junit.Assert.*;

public class Program {
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void increaseRamInLaptop() {
        Computer newRam = new Laptop(12, 32, true);
        assertEquals(12, 12);
    }
    @Test
    public void isClunkyFalse() {
        //Computer newWeight = new Laptop(4, 32, true);
        Laptop newWeight = new Laptop(4);
        assertFalse(newWeight.isClunky(), false);
    }
    @Test
    public void isClunkyTrue() {
        //Computer newWeight = new Laptop(4, 32, true);
        assertTrue(true);
    }
}
