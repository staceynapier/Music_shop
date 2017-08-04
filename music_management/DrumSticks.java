package music_management;
import actions.*;

public class DrumSticks implements Sellable {

  String material;
  String brand;
  Double buyPrice;
  Double salePrice;

  public DrumSticks(String material, String brand, Double buyPrice, Double salePrice) {
    this.material = material;
    this.brand = brand;
    this.buyPrice = buyPrice;
    this.salePrice = salePrice;
  }

  public Double calculateMarkup(){
    return (this.buyPrice / this.salePrice) *100;
  }

  public String getMaterial(){
    return this.material;
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