package items.instruments;

import items.Instrument;
import items.InstrumentType;

public class Piano extends Instrument {

    private int numOfKeys;


    public Piano(double buyPrice, double sellPrice, String colour, InstrumentType type, String material, int numOfKeys) {
        super(buyPrice, sellPrice, colour, type, material);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    @Override
    public String play() {
        return "Piano Plays";
    }
}
