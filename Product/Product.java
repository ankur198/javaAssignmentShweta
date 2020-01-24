package Product;

import Product.Tax.ITaxCalculator;
import Product.Tax.TaxCalculatorFactory;

/**
 * Product
 */
public class Product {

  String name;
  int quantity;
  double price;
  ProductType type;
  private ITaxCalculator calculator;

  public Product(String name, int quantity, double price, ProductType type) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.type = type;
    calculator = TaxCalculatorFactory.getTaxCalculator(type, price);
  }

  @Override
  public String toString() {
    return "Name - " + name + "\nQuantity - " + quantity + "\nPrice - " + price + "\nSales Tax - " + calculator.getTax()
        + "\nFinal Price - " + calculator.getFinalPrice();
  }
}