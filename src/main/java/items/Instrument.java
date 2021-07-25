package items;

public abstract class Instrument extends Item implements IPlay {

    private String colour;
    private InstrumentType type;
    private String material;

    public Instrument(double buyPrice, double sellPrice, String colour, InstrumentType type, String material) {
        super(buyPrice, sellPrice);
        this.colour = colour;
        this.type = type;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }
}
