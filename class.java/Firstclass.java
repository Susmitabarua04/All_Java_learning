import java.util.Scanner;

public class Firstclass{
    public static void main(String[] args) {
        System.out.println("i wanna go uk");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st num");
        int a = sc.nextInt();
        System.out.println("enter the 2nd num");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum is " + sum);
    }
}

