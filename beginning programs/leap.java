import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        if((yr%400==0)||(yr%4==0 && yr%100!=0))
            System.out.println("It is a leap year");
        else
        System.out.println("It is not a leap year");
    }
}
