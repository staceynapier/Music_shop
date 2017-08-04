import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class MouthPieceCleanerTest{

  MouthPieceCleaner mouthPieceCleaner;

  @Before
  public void before() {
    mouthPieceCleaner = new MouthPieceCleaner("CleanMe", 0.75, 4.99);
  }

  @Test
  public void hasBrand(){
    assertEquals("CleanMe", mouthPieceCleaner.getBrand());
  }

  @Test
  public void hasBuyPrice(){
    assertEquals(0.75, mouthPieceCleaner.getBuyPrice(), 0.01);
  }

  @Test
  public void hasSalePrice(){
    assertEquals(4.99, mouthPieceCleaner.getSalePrice(), 0.01);
  }

  @Test
  public void canCalculateMarkup(){
    assertEquals(15.03, mouthPieceCleaner.calculateMarkup(), 0.01);
  }

}