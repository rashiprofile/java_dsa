import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Greatest is: ");
        System.out.print((a>b)?((a>c)?a:c):(b>c)?b:c);
    }
}
