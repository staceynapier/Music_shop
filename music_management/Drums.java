package music_management;
import actions.*;

public class Drums extends Instrument implements Playable, Sellable {

  int noOfDrums;

  public Drums(String material, String brand, String colour, String instrumentType, Double buyPrice, Double salePrice, int noOfDrums){
    super(material, brand, colour, instrumentType, buyPrice, salePrice);
    this.noOfDrums = noOfDrums;
  }

  public int getNoOfDrums(){
    return this.noOfDrums;
  }

  public String play(){
    return "bang bang";
  }

}