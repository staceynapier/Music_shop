package music_management;
import actions.*;

public class Guitar extends Instrument implements Playable, Sellable {

  int no_of_strings;
  String type;

  public Guitar(String material, String brand, String colour, String instrument_type, int no_of_strings, String type){
    super(material, brand, colour, instrument_type);
    this.no_of_strings = no_of_strings;
    this.type = type;
  }

  public String play(){
    return "vrum";
  }

}