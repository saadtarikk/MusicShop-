package items;

public enum InstrumentType {
    PIANO("Piano"),
    GUITAR("Guitar");

    private final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
