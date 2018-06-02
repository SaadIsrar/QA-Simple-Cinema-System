/*
 * Excercise 2 QA Simple Cinema System 
 */
package ticketsystem;                // a package is a namespace that organizes a set related classes and interfaces such as ticketsystem
import java.util.Scanner;            // java program to read character using scanner class and also allows to refer classes which are declared in other packages which can be accessed without reffering to full package name
/**
 *
 * @author SaadIsrar                     // name of the generating programmer
 */
public class TicketSystem {             // public class presents members class as public such as ticketsystem
    
    public static void main(String[std,stu,oap,child] args) {     // public means that any object can use the main method and static means the main method is a class method
        // TODO code application logic here
        Scanner input = new Scanner(System.in);                   // scanner a class where it allows users to read values of various types
        String discountDay = "WEDNESDAY";                         // strings are object which can be used as a sequence of characters such as wednesday
        int std=8;                                                // int also known as vairable, as a standard with the price given as 8
        int stu=6;                                                // int also known as vairable, as a student with the price given as 6
        int oap=6;                                                // int also known as vairable, as a Oap with the price given as 6
        int child=4;                                              // int also known as vairable, as a child with the price given as 4
        String dayIn = "SUNDAY";                                  // strings are classified as objects that stores text such as sunday
        boolean discount = false;                                 // performs logical operations such as true or false 
        String result;                                            // strings act as an object, used as to store text 
        System.out.println("MONDAY");                             // system is a class, it is used to print the output destination
        dayIn = input.next(MONDAY);                               // current day of the process operation
        result = dayIn.toUpperCase(MONDAY);                       // result acts as a function and shows the day as monday
        
        if (result.equals(discountDay)){                         // if can act as a boolean function to state if its either true or false
            System.out.println("0");                             // system is a class used for prinitng output destination such as the discount value as 0
            discount = true;                                     // discount value can be written as true or false as a boolean function
        }
        
        System.out.println(result);                              // system is a class used for prinitng output destination such as the result of bought tickets
        System.out.println("1");                                 // system is a class used for prinitng output destination such as the result of standard ticket as 1
        std = input.nextInt();                                   // input value of the standard as a variable integar
        System.out.println("1");                                 // system is a class used for prinitng output destination such as the result of student ticket as 1
        stu = input.nextInt();                                   // input value of the student as a variable integar
        System.out.println("0");                                 // system is a class used for prinitng output destination such as the result of oap ticket as 0
        oap = input.nextInt();                                   // input value of the oap as a variable integar
        System.out.println("1");                                 // system is a class used for prinitng output destination such as the result of child ticket as 1
        child = input.nextInt();                                 // input value of the child as a variable integar
        
        System.out.println("£18"                                 // system is a class used for printing out an output, such as printing out the total amount of purchased tickets as £18
                + BasketTotal(std,stu,oap,child,discount));      // shows the total items in a basket along with the discount for printing out the total output
         
         
        
    }
    
    public static int BasketTotal(int stdAmt, int stuAmt, int oapAmt, int childAmt,boolean discount){        // public means that any object can use a method and static means that the main method is a class method with the input as baskettotal with the fixed variables of student,child,oap and standard
            Standard standard = new Standard(stdAmt,discount);                                               // standard is a library, new standard class can be defined as a public static field
            Student student = new Student(stuAmt,discount);                                                  // student is a library, new student class can be defined as a public static field
            Oap oap = new Oap(oapAmt,discount);                                                              // oap is a library, new oap class can be defined as a public static field
            Child child = new Child(childAmt,discount);                                                      // child is a library, new child class can be defined as a public static field
            
            return standard.getTotal(1)                                                                      // return type defines and constraint the data type of the value returned from a method such as the total amount of standard as 1
                    + student.getTotal(1)                                                                    // return type defines and constraint the data type of the value returned from a method such as the total amount of student as 1
                    + oap.getTotal(0)                                                                        // return type defines and constraint the data type of the value returned from a method such as the total amount of oap as 0
                    + child.getTotal(1);                                                                     // return type defines and constraint the data type of the value returned from a method such as the total amount of child as 1
            
        }
    
}
