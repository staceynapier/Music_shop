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

}