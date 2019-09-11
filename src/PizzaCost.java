import java.util.Scanner;
public class PizzaCost {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double labor = 1.50;
        double util = 0.75;
        double ingredients = 0.50;
        double toppings = 0.75;
        double price;
        int size, tops;
        System.out.print("Enter pizza size in inches: ");
        size = scan.nextInt();
        System.out.print("Enter number of toppings: ");
        tops = scan.nextInt();
        price = ingredients*size + toppings*tops + labor + util;
        System.out.format("The pizza costs $%.2f\n", price);
        
    }
    
}
