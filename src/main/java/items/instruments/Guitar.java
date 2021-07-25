package items.instruments;

import items.Instrument;
import items.InstrumentType;

public class Guitar extends Instrument {

    private int numOfStrings;
    public Guitar(double buyPrice, double sellPrice, String colour, InstrumentType type, String material, int numOfStrings) {
        super(buyPrice, sellPrice, colour, InstrumentType.GUITAR, material);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }


    @Override
    public String play() {
        return "Guitar Plays";
    }
}
