package music_management;
import actions.*;

public class Guitar extends Instrument implements Playable, Sellable {

  int noOfStrings;
  String type;

  public Guitar(String material, String brand, String colour, String instrument_type, int noOfStrings, String type){
    super(material, brand, colour, instrument_type);
    this.noOfStrings = noOfStrings;
    this.type = type;
  }

  public String play(){
    return "vrum";
  }

  public int getNoOfStrings(){
    return this.noOfStrings;
  }

  public String getType(){
    return this.type;
  }

}