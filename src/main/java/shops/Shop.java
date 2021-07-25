package shops;

import items.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private Double money;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.money = 0.0;
    }

    public String getName() {
        return name;
    }

    public int stockCount() {
        return stock.size();
    }

    public void addStock(ISell product) {
        stock.add(product);
    }

    public double getMoney() {
        return money;
    }

    public void addToMoney(double amount) {
        this.money += amount;
    }

    public void withdrawMoney(double amount) {
        if (money >= amount) {
            this.money -= amount;
        }
    }

    public void removeStock(ISell product) {
        stock.remove(product);
    }

    public double calculateTotalPotentialProfit() {
        double total = 0.0;
        for (ISell s : stock){
            total += s.calculateMarkup();
        }
        return total;    }


    public void sellProduct(ISell product) {
        if (stock.contains(product)) {
            stock.remove(product);
        }
    }

}
