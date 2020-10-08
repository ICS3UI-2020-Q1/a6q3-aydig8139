import java.util.Scanner;

/**
 * finds the largest number in a set
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for 10 integers
    System.out.println("Please enter in 10 integers to put into the array");

    //create an array to store the integers
    int[] integers = new int[10];

    //use a for loop to get all the integers from the user
    for(int i = 0; i < integers.length; i++){
      integers[i] = input.nextInt();
    }

    //declare a variable to store the maximum
    int maxInt = integers[0];

    //create a for loop to find the max number in the set
    for(int i = 0; i < integers.length; i++){
      
      //create an if statement to determine that the number is the maximum if the condition is met
      if (integers[i] > maxInt){
        maxInt = integers[i];
        
      }
      
    }
    //print out the maximum variable 
    System.out.println("The largest number is " + maxInt);
    }
  }
