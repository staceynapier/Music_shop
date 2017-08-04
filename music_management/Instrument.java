package music_management;

public abstract class Instrument{
  String material;
  String brand;
  String colour;
  String instrument_type;

  public Instrument(String material, String brand, String colour, String instrument_type) {
    this.material = material;
    this.brand = brand;
    this.colour = colour;
    this.instrument_type = instrument_type;
  }

  public String getMaterial(){
    return this.material;
  }

  public String getBrand(){
    return this.brand;
  }

  public String getColour(){
    return this.colour;
  }
}