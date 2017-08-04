import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class ClarinetTest{

  Clarinet clarinet;

  @Before
  public void before(){
    clarinet = new Clarinet("grenadilla", "Yamaha", "black", "woodwind", 17.00, 45.00, "single");
  }

  @Test
  public void hasMaterial(){
    assertEquals("grenadilla", clarinet.getMaterial());
  }

  @Test
  public void hasBrand(){
    assertEquals("Yamaha", clarinet.getBrand());
  }

  @Test
  public void hasColour(){
    assertEquals("black", clarinet.getColour());
  }

  @Test
  public void hasInstrumentType(){
    assertEquals("woodwind", clarinet.getInstrumentType());
  }


  @Test
  public void hasReedType(){
    assertEquals("single", clarinet.getReedType());
  }

}