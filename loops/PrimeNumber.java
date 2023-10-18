import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(int i=2;i<n/2;i++){
            if(n%i==0)
             c++;
        }
        if(c==0)
         System.out.println("It is a prime no.");
        else
         System.out.println("It is not a prime no.");
         sc.close();
}
}