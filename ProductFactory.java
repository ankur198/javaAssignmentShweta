
import Product.Product;
import Product.ProductType;

/**
 * main
 */
public class ProductFactory {

  public static boolean CreateProduct(String[] args) {

    if (args.length != 8) {
      System.out.println("Invalid input");
      return false;
    }

    Boolean isNameFound = false;
    String name = "";
    double price = 0;
    int quantity = 0;
    ProductType type = ProductType.raw;

    try {
      for (int i = 0; i < args.length; i += 2) {
        String parameter = args[i];
        String argument = args[i + 1];
        if (parameter.equals("-name")) {
          name = argument;
          isNameFound = true;
        } else if (parameter.equals("-price") && isNameFound) {
          price = Double.parseDouble(argument);
        } else if (parameter.equals("-quantity") && isNameFound) {
          quantity = Integer.parseInt(argument);
        } else if (parameter.equals("-type") && isNameFound) {
          type = ProductType.valueOf(argument);
        }
      }
    } catch (Exception e) {
      // e.printStackTrace();
      System.out.println(e.toString());
      return false;
    }

    System.out.println(new Product(name, quantity, price, type).toString());
    return true;
  }
}