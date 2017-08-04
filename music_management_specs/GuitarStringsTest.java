import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class GuitarStringsTest{

  GuitarStrings guitarStrings;

  @Before
  public void before() {
    guitarStrings = new GuitarStrings("Yamaha", 4.50, 8.00);
  }

  @Test
  public void hasBrand(){
    assertEquals("Yamaha", guitarStrings.getBrand());
  }

  @Test
  public void hasBuyPrice(){
    assertEquals(4.50, guitarStrings.getBuyPrice(), 0.01);
  }

  @Test
  public void hasSalePrice(){
    assertEquals(8.00, guitarStrings.getSalePrice(), 0.01);
  }

  @Test
  public void canCalculateMarkup(){
    assertEquals(56.25, guitarStrings.calculateMarkup(), 0.01);
  }

}