/*
 * Excercise 2 QA Simple Cinema System 
 */
package ticketsystem;                                  // a package is a namespace that organizes a set related classes and interfaces.

/**
 *
 * @author SaadIsrar                                // name of the generating programmer.
 */
public class Standard extends Ticket {             // public class presents members class as public such as standard.
    Standard(int amount, boolean discount){        // Standard refer as an object, int variables represents as integar which is a variable,boolean performs logical operations such as true or false.
        super(amount,discount);                   // super is sub class is the method definition.
        this.setPrice(8);                         // a keyword which can be used inside a method of a class and set the price as 8
    }
}