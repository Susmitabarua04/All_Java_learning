import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the First Number");
      int a = sc.nextInt();
      System.out.println("Enter the second Number");
      int b = sc.nextInt();
      System.out.println("Enter an operator (+ , - , * , /)");
      char operator = sc.next().charAt(0);
      int result = 0;
      switch(operator){
        case '+':
        result = a+b;
        break;
        case '-':
        result = a-b;
        break;
        case '*':
        result = a*b;
        break;
        case '/':
        if(b!=0){
        result = a/b;
        } else{
            System.out.println("ERROR: divided by zero");
            sc.close();
            return;
        }
        break;
        default: System.out.println("invalid operator");
    }
    System.out.println("the result is " + result);
    }
    
}

      
             
        
      
