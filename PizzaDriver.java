//**********************************************************************************************************************************//
/** 
   *   Name: Reeya Dangol    
   *
   *   Program Decription: This program asks the customer their name and their pizza's choice and displays the bill accordingly.
   *                       It also gives discount to customers with more than one order. 
*/
//***********************************************************************************************************************************//


// Imports scanner class

import java.util.Scanner;

// This is a PizzaDriver class

public class PizzaDriver 
{
   public static void main(String[] args) 
   {
    
      // Get the input from the user 
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to Pizza Express!\n");
       
       // Get the customer's name 
       System.out.print("Whom does this order belong to? Name: ");
       String name = input.nextLine();
       
        int size = 0;
        
       // Get pizza size
        System.out.println("Please choose your pizza size:");
        System.out.println("1. Small ($5)");
        System.out.println("2. Medium ($7)");
        System.out.println("3. Large ($9)");
        
        do 
        {
           System.out.print("Enter the number of your choice(1-3): ");
           size = input.nextInt();
        }
        while (size < 1 || size > 3);
        
        input.nextLine(); // Consume the newline character

       // Create a pizza object
       Pizza pizza = new Pizza(name, size);
   
       // Get additional toppings
       int toppings = 0;
       
       do 
       {
           System.out.print("Enter the number of additional toppings (each $0.50): ");
           toppings = input.nextInt();
       }
       while (toppings < 1);
       input.nextLine();
        
       pizza.extraToppings(toppings);
   
       // Add extra cheese
       System.out.print("Would you like extra cheese? (Y/N): ");
       String choice = input.next();
       if (choice.equalsIgnoreCase("Y"))
       {
           pizza.extraCheese();
       }
   
       // Get quantity
       System.out.print("How many pizzas would you like to order? ");
       int quantity = input.nextInt();
       pizza.setQuantity(quantity);
   
       // Display order summary
       System.out.println(pizza.toString());
   
       // Apply discount for larger orders
       if (quantity > 1)
       {
           System.out.println("Congratulations! You have qualified for a discount.");
           System.out.printf("Your new total after discount is: $%.2f", pizza.discountedPrice());
       }
   }
}
