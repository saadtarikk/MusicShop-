import items.InstrumentType;
import items.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar(50, 75, "wood", InstrumentType.GUITAR, "wood", 5);
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar Plays", guitar.play());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(5, guitar.getNumOfStrings());
    }

    //
    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    //
    @Test
    public void hasColour() {
        assertEquals("wood", guitar.getColour());
    }

    //
    @Test
    public void hasBuyPrice() {
        assertEquals(50.0, guitar.getBuyPrice(), 0.0);
    }

    //
    @Test
    public void hasSellPrice() {
        assertEquals(75.0, guitar.getSellPrice(), 0.0);
    }

    //
    @Test
    public void canCalculateMarkup() {
        assertEquals(25.00, guitar.calculateMarkup(), 0.0);

    }
}
