package Product.Tax;

public class ManufacturedTaxCalculator extends RawTaxCalculator implements ITaxCalculator {

  public ManufacturedTaxCalculator(double price) {
    super(price);
  }

  final double manufacturingTax = 0.02;

  @Override
  public double getTax() {
    return basic * price + (manufacturingTax * (price + basic * price));
  }

}