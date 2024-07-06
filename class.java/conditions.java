import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter button");
        int button = sc.nextInt();
        /* System.out.println("enter the age ");
        int age = sc.nextInt();
        if(age>=18){
          System.out.println("you're an adult.");  
        }
        else{
            System.out.println("you're not an adult");
        }*/ 

        /*System.out.println("enter the num");
        int x = sc.nextInt();
        if(x % 2 ==0){
            System.out.println("This num is Even");
        }
        else{
            System.out.println("this num is odd");
        }*/

      /*   System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        if(a==b){
          System.out.println("both are equal");
        } else {
            if(a>b){
                System.out.println("a is greater than b");
            }
            else{
                System.out.println("a is lesser than b");
            }
        }
        */

        switch(button){
            case 1 : System.out.println("HELLO");
            break;
            case 2 : System.out.println("NAMASTE");
            break;
            case 3: System.out.println("Ni hao");
            break;
            default:System.out.println("invalid buttton");
        }
    }
    }

