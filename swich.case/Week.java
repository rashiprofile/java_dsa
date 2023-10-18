import java.util.*;
public class Week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Monday\nEnter 2 for Tuesday\nEnter 3 for Wednesday\nEnter 4 for Thursday\nEnter 5 for Friday\nEnter 6 for Saturdayday\nEnter 7 for Sunday");
        int day=sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                break;
        }
    }
}
