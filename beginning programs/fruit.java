import java.net.SocketTimeoutException;
import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a fruit name");
        String s=sc.nextLine();
        switch(s)
        {
            case "apple":
                System.out.println("Apple is red in colour");
                break;
            case "banana":
                System.out.println("Banana is healthy");
                break;
            case "orange":
                System.out.println("Orange is sphere in shape");
                break;
            case "mango":
                System.out.println("Mango is king of fruits");
                break;
            default:
                System.out.println("Invalid ! ");
        }
    }
}
