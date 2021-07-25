import items.InstrumentType;
import items.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before() {
        piano = new Piano(200, 500, "Black", InstrumentType.PIANO, "Wood", 88);
    }

    @Test
    public void canPlay() {
        assertEquals("Piano Plays", piano.play());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.PIANO, piano.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(200.0, piano.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(500.0, piano.getSellPrice(), 0.0);
    }


    @Test
    public void canCalculateMarkup() {
        assertEquals(300.00, piano.calculateMarkup(), 0.0);
    }

}
