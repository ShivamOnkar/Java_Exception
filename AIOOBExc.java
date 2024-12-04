public class AIOOBExc {
    public static void main(String args[]){
        int a[] = {5,6,9,5,4,45,4,45,54,2};
        try{
            System.out.println(a[5]);
            System.out.println(a[0]);
            System.out.println(a[12]);
             System.out.println(a[9]);
            System.out.println(a[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid input");

        }
        System.out.println("Rest of code....");
    }
}


//NullPointerException
/*
 * class Demoo{
 * public static void main(String args[]){
 * String s = null;
 * System.out.println(s.length());
 * }
 * }
 */