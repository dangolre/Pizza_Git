//**********************************************************************************************************************************//
/** 
   *   Name: Reeya Dangol                                                                       
   *
   *   Program Decription: This program creates a class used to build a pizza. It has instance variables that store the size of pizza, 
                     whether it's veg or non-veg, the number of toppings and the price. The program includes a no-argument constructor, 
                     multi-argument constructors, getters and setters, toString and equals methods, and two additional methods to add
                     extra toppings and extra cheese.
*/
//***********************************************************************************************************************************//

/**
   * This is a Pizza class
*/
public class Pizza
{
    // Setting data attributes for name, size, numToppings, extraCheese and quantity 
    
      /**
         * The name of the pizza.
      */
      private String name;
      
      /**
         * The size of the pizza. 1: small, 2: medium, 3: large.
      */
      private int size;
      
      /**
         * The number of toppings on the pizza.
      */
      private int numToppings;
      
      /**
         * Indicates whether the pizza has extra cheese.
      */
      private String extraCheese;
      
      /**
         * The quantity of this pizza order.
      */
      private int quantity;
       
       // Sets constant values to small_price, medium_price, and large_price
       
      /**
         * The price of a small pizza.
      */
      private static final double SMALL_PRICE = 5.0;
      
      /**
         * The price of a medium pizza.
      */
      private static final double MEDIUM_PRICE = 7.0;
      
      /**
         * The price of a large pizza.
      */
       private static final double LARGE_PRICE = 9.0;
      
      
       /** 
         * This is a new Pizza constructor which initializes the name and size of pizza as passed by the customer.
         *
         * @param name represents the name of the customer
         * @param size represents the size of the pizza (1: small, 2: medium, 3: large)
       */ 
       public Pizza(String name, int size) 
       {
           this.name = name;
           this.size = size;
           this.numToppings = 0;
           this.extraCheese = "";
           this.quantity = 1;
       }
    
    
       /** 
         * This is a new no argument Pizza constructor. 
         *
         * Constructs a new Pizza object with default values for all attributes.
       */     
       public Pizza() 
       {
           this.name = "";
           this.size = 1;
           this.numToppings = 0;
           this.extraCheese = "";
           this.quantity = 1;
       }
       
       
      /**
         * Gets the name of the customer.
         *
         * @return the name of the customer.
       */
      public String getName()
      {
         return name;
      } 
      
      
      /** 
         * Sets the name of the customer to a guven value.
         * 
         * @param name the new name of the customer
      */  
      public void setName(String name)
      {
         this.name = name;
      }
      
      
      /**
         * Gets the pizza size.
         *
         * @return size of the pizza 
       */ 
       public int getSize()
       {
         return size;
       }
       
       
       /** 
         * Sets the size of the pizza to a given value.
         * 
         * @param size the new size of the pizza (1: small, 2: medium, 3: large)
      */
       public void setSize(int size)
       {
         this.size = size;
       }
       
   
       /**
         * Gets the number of toppings.
         *
         * @return number of toppings. 
       */ 
       public int getNumToppings()
       {
         return numToppings;
       }
       
        /** 
         * Sets the number of toppings of the pizza to a given value.
         * 
         * @param numToppings the new numToppings of the pizza 
        */
       public void setNumToppings(int numToppings)
       {
         this.numToppings = numToppings;
       }
   
       /**
         * Gets the extra cheese value.
         *
         * @return extra cheese. 
       */ 
       public String getExtraCheese()
       {
         return extraCheese;
       }
   
        /** 
         * Sets the extraCheese of the pizza to a given value.
         * 
         * @param extraCheese the new extraCheese value 
        */
       public void setExtraCheese(String extraCheese)
       {
         this.extraCheese = extraCheese;
       }
      
   
       /**
          * Sets the number of toppings for the pizza to the given value.
          *
          * @param numToppings the number of toppings to add to the pizza
       */
       public void extraToppings(int numToppings)
       {
           this.numToppings = numToppings;
       }
       
       
       /**
          * Sets whether the customer wants extra cheese on the pizza.
       */
       public void extraCheese() 
       {
           this.extraCheese = "Y";
       }
      
       
       /**
         * Gets the number of pizza.
         *
         * @return number of pizza. 
       */ 
       public int getQuantity()
       {
         return quantity;
       }
       
       
       /**
          * Sets the quantity of pizzas ordered to the given value.
          *
          * @param quantity the quantity of pizzas ordered
       */
       public void setQuantity(int quantity) 
       {
           this.quantity = quantity;
       }
   
       /**
          * Calculates and returns the total price of the pizza order.
          *
          * The price is calculated based on the pizza size, number of toppings and extra cheese.
          *
          * @return the total price of the pizza order
       */
       double price;
       public double getPrice() 
       {
           double basePrice = 0.0;
           
           switch (size) 
           {
               case 1:
                   basePrice = SMALL_PRICE;
                   break;
               case 2:
                   basePrice = MEDIUM_PRICE;
                   break;
               case 3:
                   basePrice = LARGE_PRICE;
                   break;
           }
           
           // calculate toppings price by multiplying number of toppings by 0.5
           double toppingsPrice = numToppings * 0.5;
           
           // determine cheese price based on whether extra cheese is added
           double cheesePrice;
           
           if (extraCheese.equals("Y") || extraCheese.equals("y"))
           {
               cheesePrice = 1.0;
           }
           else
           {
               cheesePrice = 0.00;
           }
           
           // calculate price by adding base price, toppings price, and cheese price
           price = (basePrice + toppingsPrice + cheesePrice);
           
           // multiply price by quantity of pizzas ordered
           double totalPrice = price  * quantity;
           
           return totalPrice;
           
       }
       
       
       /**
         * Calculates discount percentage of the pizza as per the quantity. 
         *        
         * @return string containing formatted and labelled alien's name, weight, and password
       */
       
       public double discount() 
       {
           if (quantity == 2) 
           {
               return 0.05;
           } 
           else if (quantity == 3) 
           {
               return 0.1;
           } 
           else if (quantity > 4) 
           {
               return 0.15;
           }
            else 
           {
               return 0.0;
           }
       }
   
   
       /**
         * Formats and labels the data according to desired output.
         *        
         * @return string containing formatted and labelled customer's name, pizza choice, quantity, total price, and discount amount 
       */      
       public String toString() 
       {
           return String.format("\nPizza Order for %s:\n" +
                   "\nSize: %s\n" +
                   "Number of Toppings: %d\n" +
                   "Quantity: %d\n" +
                   "Total Price: $%.2f\n" +
                   "Discount: %.0f%%\n",
                   name, sizeToString(), numToppings, quantity, getPrice(), discount() * 100);
       }
       
       
       /**
         * Calculates the discounted price of this pizza order, taking into account any available discounts.
         *
         * @return The discounted price of this pizza order, based on the price, quantity, and available discounts.
       */
       
       public double discountedPrice()
       {
         double discount = discount();
         return price * quantity * (1 - discount);
       }
       
   
      /**
         * A private sizeToString method
         *
         * @return A string representation of the size of this pizza order.
      */
      
       private String sizeToString() 
       {
           switch (size) 
           {
               case 1:
                   return "Small";
               case 2:
                   return "Medium";
               case 3:
                   return "Large";
               default:
                   return "";
           }
       }
   }
   