//PRINT THE TABLE OF A NUM INPUT BY THE USER. 
/*import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUM");
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
           int a = (n*i);
            System.out.println(a);
        }
       ;
    }
}
 */

//PRINT THE SUM OF 1ST n NATURAL number.
import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of 'n'");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("the sum is " + sum);

    }
}
