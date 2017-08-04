import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class GuitarTest{

  Guitar guitar;

  @Before
  public void before(){
    guitar = new Guitar("bamboo", "Gibson", "natural", "string", 6, "acoustic");
  }

  @Test
  public void hasMaterial(){
    assertEquals("bamboo", guitar.getMaterial());
  }

  @Test
  public void hasBrand(){
    assertEquals("Gibson", guitar.getBrand());
  }

  @Test
  public void hasColour(){
    assertEquals("natural", guitar.getColour());
  }

  @Test
  public void hasInstrumentType(){
    assertEquals("string", guitar.getInstrumentType());
  }

  @Test
  public void hasNoOfStrings(){
    assertEquals(6, guitar.getNoOfStrings());
  }

}