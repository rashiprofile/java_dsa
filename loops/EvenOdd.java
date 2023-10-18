import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a range to print even no.:");
        int n=sc.nextInt();
        System.out.println("All even numbers in this range:");
        for (int i = 0; i <=n; i++) {
            if(i%2==0)
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("All odd numbers in this range:");
        for (int i = 0; i <=n; i++) {
            if(i%2!=0)
            System.out.print(i+" ");
        }
        sc.close();
    }
}
