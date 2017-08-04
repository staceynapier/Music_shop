package music_management;
import actions.*;

public class Drums extends Instrument implements Playable, Sellable {

  int noOfDrums;

  public Drums(String material, String brand, String colour, String instrument_type, int noOfDrums){
    super(material, brand, colour, instrument_type);
    this.noOfDrums = noOfDrums;
  }

  public String play(){
    return "bang bang";
  }

  public int getNoOfDrums(){
    return this.noOfDrums;
  }

}