import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n,f=1;
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        System.out.println("Factorial : "+f);
        sc.close();
    }
}
