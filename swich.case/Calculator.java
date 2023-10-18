import java.util.Scanner;
class Calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two operands:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter an operator (+,-,*,/,%):");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+':
                System.out.println("Add : "+(a+b));
                break;
            case '-':
                System.out.println("Subtract : "+(a-b));
                break;
            case '*':
                System.out.println("Multiply: "+(a+b));
                break;
            case '/':
                System.out.println("Divide: "+(a/b));
                break;
            case '%':
                System.out.println("Mode: "+(a%b));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}