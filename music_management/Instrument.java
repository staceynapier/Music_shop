package music_management;

public abstract class Instrument{
  String material;
  String brand;
  String colour;
  String instrumentType;
  Double buyPrice;
  Double salePrice;

  public Instrument(String material, String brand, String colour, String instrumentType, Double buyPrice, Double salePrice) {
    this.material = material;
    this.brand = brand;
    this.colour = colour;
    this.instrumentType = instrumentType;
    this.buyPrice = buyPrice;
    this.salePrice = salePrice;
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

  public String getInstrumentType(){
    return this.instrumentType;
  }

  public Double getBuyPrice(){
    return this.buyPrice;
  }

  public Double getSalePrice(){
    return this.salePrice;
  }

  public Double calculateMarkup(){
    return (this.buyPrice / this.salePrice) *100;
  }
}