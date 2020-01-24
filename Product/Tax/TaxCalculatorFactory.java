package Product.Tax;

import Product.ProductType;

/**
 * TaxCalculatorFactory
 */
public class TaxCalculatorFactory {

  public static ITaxCalculator getTaxCalculator(ProductType type,double price) {
    switch (type) {
    case raw:
      return new RawTaxCalculator(price);
    case manufactured:
      return new ManufacturedTaxCalculator(price);
    case imported:
      return new ImportedTaxCalculator(price);
    default:
      return new RawTaxCalculator(price);
    }
  }
}