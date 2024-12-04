import java.util.*;
public class Exceptionproject {
  public static void main(String args[])throws InvalidAgeException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age ");
    int age = sc.nextInt();
    if(age >= 18){
        System.out.println("Welcome to portal");

    }else{
        throw new InvalidAgeException("Error:Age is not found");

    }
    System.out.println("Rest of code...");
    System.out.println("Rest of code...");
    System.out.println("Rest of code...");
    sc.close(); // Ensure the scanner is closed
    
  }  
}
