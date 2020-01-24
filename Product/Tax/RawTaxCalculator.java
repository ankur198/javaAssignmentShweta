package Product.Tax;

/**
 * RawTaxCalculator
 */
public class RawTaxCalculator extends AbstractTaxCalculator implements ITaxCalculator {

  public RawTaxCalculator(double price) {
    super(price);
  }

  final double basic = 0.125;

  @Override
  public double getTax() {
    return price * basic;
  }

}
