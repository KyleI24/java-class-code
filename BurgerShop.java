// Name: Kyle Intendencia
// Program: BurgerShop.java
// Date: January 31, 2024
// Description: Gets users input of their name and amount of burgers purchased and then calculate their receipt and displays it to the user.

import java.util.Scanner;

public class BurgerShop {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);// creates a scanner to ask for customers name and quantity of burgers purchased
        System.out.print("Enter customer name: ");
        String customer = scanner1.nextLine();
        System.out.print("Enter quantity of burgers: ");
        int burger = scanner1.nextInt();
        double totalcost = totalCost(burger);// calculates the total cost of a burger
        double taxamount = taxAmount(totalcost);// calculates tax of the total burgers purchased
        System.out.println("------- Receipt -------");// displays the receipt from the prevous inputs combined
        System.out.println("Customer: " + customer);
        System.out.println("Quantity of Burgers: " + burger);
        System.out.println("Price per Burger: $5.99");
        System.out.println("Total Cost: $" + totalcost);
        System.out.println("Tax Amount: $" + taxamount);
        System.out.println("Grand Total: $" + totalcost + taxamount);// adds the tax and total cost to get the grand total
        System.out.println("-----------------------");
    }
    public static double totalCost(double burger) {// a method to calculate the total cost of burgers
        double total_cost = burger * 5.99;
        return total_cost;
    }
    public static double taxAmount(double total_cost) {// gets the tax amount using the total cost
        double tax_amount = total_cost * 0.07;
        return tax_amount;
    }
}
