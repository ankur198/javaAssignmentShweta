package Product.Tax;

public abstract class AbstractTaxCalculator implements ITaxCalculator {
  double price;

  public AbstractTaxCalculator(double price) {
    this.price = price;
  }

  @Override
  public double getFinalPrice() {
    return price + getTax();
  }
}