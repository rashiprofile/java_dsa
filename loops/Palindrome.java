import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n,m,r=0;
        n=sc.nextInt();
        m=n;
        while(n>0)
        {
            r=r*10+(n%10);
            n/=10;
        }
        if(m==r)
         System.out.println("It is a pallindrome no.");
        else
         System.out.println("It is not a pallindrome no.");
        sc.close();
    }
}
