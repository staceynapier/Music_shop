package music_management;
import java.util.ArrayList;
import actions.*;

public class Shop {

  private ArrayList<Sellable> stock = new ArrayList<Sellable>();

  public int itemCount(){
    return stock.size();
  }

  public void add(Sellable item) {
    stock.add(item);
  }

  public void clear(){
    stock = null;
  }


} 