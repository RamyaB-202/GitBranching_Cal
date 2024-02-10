// Import the Scanner class
import java.util.Scanner;

// Define a class
public class primeno {

  // Define a method to generate prime numbers
  public static void prime() {
    // Create a Scanner object
    Scanner sc = new Scanner(System.in);

    // Prompt the user to enter the lower and upper bounds of the range
    System.out.println("Enter the lower and upper bounds of the range:");
    int low = sc.nextInt();
    int high = sc.nextInt();

    // Use a loop to iterate over the numbers in the range
    for (int i = low; i <= high; i++) {
      // Assume that the current number is prime
      boolean isPrime = true;

      // Use a loop to check if the current number has any factors other than 1 and itself
      for (int j = 2; j < i; j++) {
        // If the current number is divisible by any other number, it is not prime
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }

      // If the current number is prime, print it
      if (isPrime && i > 1) {
        System.out.print(i + " ");
      }
    }
    sc.close();
  }

  // Define the main method
  public static void main(String[] args) {
    // Call the method
    prime();
  }
}