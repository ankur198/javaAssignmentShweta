import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    boolean res = ProductFactory.CreateProduct(args);
    Scanner sc = new Scanner(System.in);

    while (res) {
      System.out.println("Do you want to add?(y/n)");
      String ch = sc.nextLine();
      if (ch.toLowerCase().equals("y")) {
        System.out.println("Enter detaild of new product.\n");
        String rawArgs = sc.nextLine();
        args = rawArgs.split(" ");
        res = ProductFactory.CreateProduct(args);
      } else if (ch.toLowerCase().equals("n")) {
        sc.close();
        return;
      } else {
        System.out.println("Invalid input\n");
      }
    }
  }
}