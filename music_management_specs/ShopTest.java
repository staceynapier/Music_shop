import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;
import actions.*;

public class ShopTest{

  Shop shop;
  Guitar guitar;
  Resin resin;

  @Before
  public void before() {
    shop = new Shop();
    guitar = new Guitar("bamboo", "Gibson", "natural", "string", 25.00, 70.00, 6, "acoustic");
    resin = new Resin("Amber", 0.20, 2.00);
  }

  @Test
  public void canAddToShop() {
    shop.add(guitar);
    assertEquals(1, shop.itemCount());
  }

  @Test
  public void canRemoveItemFromShop() {
    shop.add(resin);
    Sellable item = shop.clear();
    Resin addedItem = (Resin) item;
    assertEquals("Amber", addedItem.getBrand());
  }

}