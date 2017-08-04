package music_management;
import actions.*;

public class Clarinet extends Instrument implements Playable, Sellable {

  String reedType;

  public Clarinet(String material, String brand, String colour, String instrument_type, String reedType){
    super(material, brand, colour, instrument_type);
    this.reedType = reedType;
  }

  public String play(){
    return "toot toot";
  }

  public String getReedType(){
    return this.reedType;
  }
}