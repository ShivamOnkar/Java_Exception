import java.util.*;
import java.util.InputMismatchException;
public class ArithmeticExc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=0,b=0;
        try{
    System.out.println("Enter First number");
     a = sc.nextInt();
    System.out.println("Enter Second number");
    b = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid Inputs");
        }
    int c=0;

        try{
            c= a/b;

        }
        catch(ArithmeticException e){
            System.out.println("can not divide by zero value");

        }
        System.out.println("Result - "+c);
        System.out.println("Rest of code....");
        sc.close();
    }
}


/*
 * import java.util.*;
import java.util.InputMismatchException;
public class ArithmeticExc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=0,b=0 ,c=0;
        try{
        System.out.println("Enter First number");
        a = sc.nextInt();
        System.out.println("Enter Second number");
        b = sc.nextInt();
        c= a/b;
         }
        catch(ArithmeticException e){
            System.out.println("can not divide by zero value");

        }catch(InputMismatchException e){
        System.otu.println("Invalid Inputs");
        }
        System.out.println("Result - "+c);
        System.out.println("Rest of code....");
        sc.close();
    }
}
 * 
 */
