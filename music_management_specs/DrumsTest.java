import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class DrumsTest{

  Drums drums;

  @Before
  public void before() {
    drums = new Drums("maple and steel", "Pearl", "white", "percussion", 130.00, 299.00,5);
  }

  @Test
    public void hasMaterial(){
      assertEquals("maple and steel", drums.getMaterial());
    }

    @Test
    public void hasBrand(){
      assertEquals("Pearl", drums.getBrand());
    }

    @Test
    public void hasColour(){
      assertEquals("white", drums.getColour());
    }

    @Test
    public void hasInstrumentType(){
      assertEquals("percussion", drums.getInstrumentType());
    }

    @Test
    public void hasNoOfDrums(){
      assertEquals(5, drums.getNoOfDrums());
    }

    @Test
    public void hasBuyPrice(){
      assertEquals(130.00, drums.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSalePrice(){
      assertEquals(299.00, drums.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
      assertEquals(43.48, drums.calculateMarkup(), 0.01);
    }

}