import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        System.out.println("Enter a vowel:");
        Scanner sc=new Scanner(System.in);
        char v=sc.next().charAt(0);
        switch(v)
        {
            case 'a','A','e','E','i','I','o','O','u','U' -> System.out.println("It is a vowel.");
            default -> System.out.println("It is not a vowel.");
        }        
    }
}
