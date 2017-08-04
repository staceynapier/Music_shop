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

}