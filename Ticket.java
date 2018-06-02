/*
 * Excercise 2 QA Simple Cinema System 
 */
package ticketsystem;                       // a package is a namespace that organizes a set related classes and interfaces

/**
 *
 * @author SaadIsrar                        // name of the generating programmer
 */
public abstract class Ticket {              // abstract class contain one or more abstract methods
    private int ticketPrice;                // this field only accessible only within its own class such as the ticket price
    private int ticketAmount;               // this field only accessible only within its own class such as the ticket amount
    private int reduction = 2;              // this field only accessible only within its own class such as the reduction of £2 as a discount
    boolean discount;                       // performs logical operations such true or false, to see if the statement is either true or false
    
    public Ticket(int amount, boolean discount){      // public performs public access as purchasing a public ticket
        this.ticketAmount = 18;                   // a keyword which can be used inside a method of a class and set the price as the ticket amount
        this.discount = 0;                      // a keyword which can be used inside a method of a class and set the price as the ticket discount amount
    }
    int getPrice(18){                                     // int is a variable and can be used as to get the price
        if (discount == true){                          // if represents the logical negation, if the statement is true or false
          return ticketPrice - reduction;               // defines the data type of the value returned from a method, in this case it is the discounted ticket price
        }
        
        else{                                           // execute one block of code among many
            return ticketPrice;                          // the return of the value from a method, in this case it would be the different ticket prices
        }
    }
    
    void setPrice(int 18){                           // void means that the method has no return value
        this.ticketPrice = price;                        // a keyword which can be used inside a method of a class and set the price as the ticket price
    }
    
    int getTotal(18){                                        // int is a variable and can be used as to get the total price of the tickets
        if (discount == true){                                // if represents the logical negation, if the statement is true or false
            return (ticketPrice-reduction)*ticketAmount;     // defines the data type of the value returned from a method, in this case it is the actual discounted ticket price
        }
        else{                                                  // execute one block of code among many
          return ticketPrice*ticketAmount;                      // the return of the value from a method, in this case it would be the total ticket amount 
        }
        
    }
}
