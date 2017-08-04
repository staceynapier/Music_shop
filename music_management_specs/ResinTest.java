import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class ResinTest{

  Resin resin;

  @Before
  public void before() {
    resin = new Resin("Amber", 0.20, 2.00);
  }

  @Test
  public void hasBrand(){
    assertEquals("Amber", resin.getBrand());
  }

  @Test
  public void hasBuyPrice(){
    assertEquals(0.20, resin.getBuyPrice(), 0.01);
  }

  @Test
  public void hasSalePrice(){
    assertEquals(2.00, resin.getSalePrice(), 0.01);
  }

  @Test
  public void canCalculateMarkup(){
    assertEquals(10.00, resin.calculateMarkup(), 0.01);
  }

}