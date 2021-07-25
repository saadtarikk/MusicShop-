import items.InstrumentType;
import items.instruments.Guitar;
import items.instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import shops.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;

    @Before
    public void before() {
        shop = new Shop("Music Shop");
        guitar = new Guitar(50, 75, "wood", InstrumentType.GUITAR, "wood", 5);
        piano = new Piano(200, 500, "Black", InstrumentType.PIANO, "Wood", 88);

    }

    @Test
    public void hasName() {
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void hasEmptyStock() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.removeStock(piano);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        shop.addStock(piano);
        shop.addStock(guitar);
        assertEquals(325.0, shop.calculateTotalPotentialProfit(), 0.0);
    }

    @Test
    public void canSellProduct() {
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.sellProduct(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canGetMoney() {
        assertEquals(0.0, shop.getMoney(), 0.1);
    }

    @Test
    public void canAddToMoney() {
        shop.addToMoney(10.0);
        assertEquals(10.0, shop.getMoney(), 0.1);
    }

    @Test
    public void canWithdrawMoney() {
        shop.addToMoney(10.0);
        shop.withdrawMoney(5.0);
        assertEquals(5.0, shop.getMoney() , 0.1);
    }


    @Test
    public void cantSellProductIfNotInStock() {
        shop.addStock(guitar);
        shop.sellProduct(guitar);
        shop.sellProduct(guitar);
        assertEquals(0, shop.stockCount());
    }

}
