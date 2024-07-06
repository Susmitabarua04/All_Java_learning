//solid rectangle
/*import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of n");
        int n = sc.nextInt();
        System.out.println("enter the no of m");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}*/
//HOLLOW RECTANGLE
/*import java.util.Scanner;
public class patterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of 'n'");
        int n = sc.nextInt();
        System.out.println("enter the no of 'm'");
        int m = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m;j++){
                if( i== 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}*/

//HALF PYRAMID
/*import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of n");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}*/

//inversed half pyramid
/*import java.util.Scanner;

public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of n");
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}*/

//inversed half pyramid (rotated by 180 deg)
/*import java.util.Scanner;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of n");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
} */

//print the half pyramid but in num

/*import java.util.Scanner;

public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of n");
        int n = sc.nextInt();
        System.out.println("sol");
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/



