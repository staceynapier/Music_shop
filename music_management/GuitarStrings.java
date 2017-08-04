package music_management;
import actions.*;

public class GuitarStrings implements Sellable {

  String brand;
  Double buyPrice;
  Double salePrice;

  public GuitarStrings(String brand, Double buyPrice, Double salePrice) {
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

  public Double getBuyPrice(){
    return this.buyPrice;
  }

  public Double getSalePrice(){
    return this.salePrice;
  }

}