package items;

public class Item implements ISell {

    private double buyPrice;
    private double sellPrice;

    public Item(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
