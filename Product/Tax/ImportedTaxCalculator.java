package Product.Tax;

public class ImportedTaxCalculator extends AbstractTaxCalculator implements ITaxCalculator {

  public ImportedTaxCalculator(double price) {
    super(price);
  }

  final double importDuty = 0.10;

  @Override
  public double getTax() {
    double x = importDuty * price;
    if (x <= 100) {
      return x + 5;
    } else if (x <= 200) {
      return x + 10;
    } else {
      return x * 1.05;
    }
  }

}