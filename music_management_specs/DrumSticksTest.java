import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class DrumSticksTest{

  DrumSticks drumSticks;

  @Before
  public void before() {
    drumSticks = new DrumSticks("wood", "Yamaha", 0.50, 4.00);
  }

  @Test
  public void hasMaterial(){
    assertEquals("wood", drumSticks.getMaterial());
  }

  @Test
  public void hasBrand(){
    assertEquals("Yamaha", drumSticks.getBrand());
  }

}