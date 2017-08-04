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

}