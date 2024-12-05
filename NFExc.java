//NumberFormateException throw
public class NFExc {
    public static void main(String args[]){
        String a1 = "12.56";
        String a2 = "56";
        System.out.println(a1+a2);
        int n1 = Integer.parseInt(a1);
        int n2 = Integer.parseInt(a2);
        System.out.println(n1+n2);
    }
}

//IndexOutOfBoundsException
/*
 * import java.util.ArrayList;
 * class Demoo{
 * public static void main(String args[]){
 * ArrayList<Integer> list = new ArrayList<>();
 * list.add(5);
 * list.add(6);
 * list.add(41);
 * System.out.println(list.get(2));
 * System.out.println(list.get(3));
 * }
 * }
 */
