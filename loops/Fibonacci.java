import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of terms:");
        int n=sc.nextInt();
        int f=0,l=1,s;
        System.out.print(f+" "+l+" ");
        for (int i = 0; i < n-2; i++) {
            s=f+l;
            f=l;
            l=s;
            System.out.print(s+" ");
        }
        sc.close();
    }
}
