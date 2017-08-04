package music_management;
import actions.*;

public class MouthPieceCleaner implements Sellable {

  String brand;
  Double buyPrice;
  Double salePrice;

  public MouthPieceCleaner(String brand, Double buyPrice, Double salePrice) {
    this.brand = brand;
    this.buyPrice = buyPrice;
    this.salePrice = salePrice;
  }

  public Double calculateMarkup(){
    return (this.buyPrice / this.salePrice) *100;
  }

  public String getBrand(){
    return this.brand;
  }

}