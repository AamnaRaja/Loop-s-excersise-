import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Question 1 
    //input 
    Scanner input = new Scanner (System.in);
  // Initialize counters
        int passingCount = 0;
        int failingCount = 0;
    // Loop to enter marks
    System.out.println("Enter percentage marks (enter -1 to stop):");
    int mark = input.nextInt();
    while (mark != -1) {
     if (mark >= 50) {
        passingCount++;
     } 
      else {
        failingCount++;
      }
      mark = input.nextInt();
        }
    // Output
    System.out.println("Number of passing marks: " + passingCount);
    System.out.println("Number of failing marks: " + failingCount);


    //Question 2 
   // Input
    Scanner input = new Scanner(System.in);

    int sum = 0;
    int count = 0;

   // Loop to enter numbers
    int continueInput = 1;
    while (continueInput == 1) {
      System.out.print("Enter a number: ");
       int number = input.nextInt();

        sum += number;
        count++;

      System.out.print("Do you want to enter another number? (1 for yes, 0 for no): ");
      
      continueInput = input.nextInt();

      while (continueInput != 1 && continueInput != 0) {
        System.out.print("Invalid input. Do you want to enter another number? (1 for yes, 0 for no): ");
        continueInput = input.nextInt();
      }
        }
    // Output
    double average = 0;
    if (count != 0) {
      average = (double) sum / count;
        }
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);
    }

    
  
  //Question 3 
  // Input
        Scanner input = new Scanner(System.in);
    
    int anotherCustomer = 1;
    
    while (anotherCustomer == 1) {
      System.out.print("Enter the number of CDs: ");
      int numCDs = input.nextInt();
      
      System.out.print("Enter the number of DVDs: ");
      int numDVDs = input.nextInt();
      
      double totalPrice = 0;
      
   // Calculate the total price before discount
      double cdPrice = numCDs * 13.99;
      double dvdPrice = numDVDs * 19.99;
      totalPrice = cdPrice + dvdPrice;
      
   // Check if the customer is eligible for a discount
      if (numCDs + numDVDs >= 10) {
        totalPrice *= 0.9; // apply 10% discount
            }
   // Calculate the tax
      double tax = totalPrice * 0.13;
      
  // Calculate the final total
      double finalTotal = totalPrice + tax;
      
  // Output
      System.out.println("\n--- Receipt ---");
      System.out.println("Number of CDs: " + numCDs);
      System.out.println("Number of DVDs: " + numDVDs);
      
      if (numCDs + numDVDs >= 10) {
        System.out.println("10% discount applied.");
      }
      System.out.println("Total (before tax): $" + String.format("%.2f", totalPrice));
      System.out.println("Tax: $" + String.format("%.2f", tax));
      System.out.println("Final total (including tax): $" + String.format("%.2f", finalTotal));
      
  // Check if there is another customer
      System.out.print("\nDo you want to process another customer? (1 for yes, 0 for no): ");
      anotherCustomer = input.nextInt();
      while (anotherCustomer != 1 && anotherCustomer != 0) {
        System.out.print("Invalid input. Do you want to process another customer? (1 for yes, 0 for no): ");
        anotherCustomer = input.nextInt();
            }
        }

System.out.println("Thank you for using Orion Entertainment!");
    }


  //Question  4 
 Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int n = input.nextInt();
    
    if (n < 0) {
      System.out.println("Error: The number must be positive.");
      return;
    }
    int factorial = 1;
    int i = 1;
    
    while (i <= n) {
      factorial *= i;
      i++;
    }
    System.out.println(n + "! = " + factorial);


  //Question 5 
 Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    
    int i = 1;
    while (i <= num) {
      
      if (i % 7 == 0) {
        System.out.println("Buzz!");
      } 
      else {
        System.out.println(i);
      }
      i++;
    }


  // Question 6 
// Define the correct password
        String password = "password123";
        
        // Initialize the number of tries to 0
        int numTries = 0;
        
        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Loop until the user has used up all 5 tries
        while (numTries < 5) {
            
            // Prompt the user to enter a password guess
            System.out.print("Enter your password guess: ");
            String guess = input.nextLine();
            
            // Increment the number of tries
            numTries++;
            
            // Check if the guess is correct
            if (guess.equals(password)){
             System.out.println("You guessed correctly!");
                break; // exit the loop
            } 
            else {
              System.out.println("Incorrect, try again!");
            }
        }
    // If the loop has exited, the user has used up all 5 tries
    System.out.println("You have used up all 5 tries. The correct password was: " +" "+ password);


  //Question 7
Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Display multiplication table
        for (int i = 1; i <= 12; i++) {
            int product = i * number;
          System.out.printf("%d * %d = %d%n", i, number, product);
        }


  }
}
