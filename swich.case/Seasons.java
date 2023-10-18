import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the month number:");
        int mnth=sc.nextInt();
        switch(mnth){
            case 1:
            case 2:
            case 11:
            case 12:
                System.out.println("Winter Season");
                break;
            case 3:
            case 4:
                System.out.println("Spring Season");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Summer Season");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Autumn Season");
                break;
            default:
                System.out.println("You enter wrong input!");
        }

        sc.close();
    }
}
