import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the color of light:");
        String color=sc.nextLine();
        switch(color)
        {
            case "red":
                System.out.println("Stop\nNext light will be Yellow, then wait");
                break;
            case "yellow":
                System.out.println("Wait\nNext light will be Green, then go");
                break;
            case "green":
                System.out.println("Go\nNext light will be Yellow, thenn wait");
                break;
            default:
                System.out.println("You have entered wrong input!");
        }
        sc.close();
    }
}
