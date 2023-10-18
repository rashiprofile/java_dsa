import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int money,ch;
        System.out.println("Enter your balance :");
        int bal=sc.nextInt();
        do{
        System.out.println("Enter 1 to check your balance.\nEnter 2 to deposit money.\nEnter 3 to withdraw money.");
         ch=sc.nextInt();
        
        switch(ch){
            case 1:
                System.out.println("Your current balance is : "+bal);
                break;
            case 2:
                System.out.println("Enter money you want to deposit: ");
                money=sc.nextInt();
                bal+=money;
                break;
            case 3:
                System.out.println("Enter money you want to withdraw: ");
                money=sc.nextInt();
                bal-=money;
                break;
            // default:
                
        }
    }while(ch<4);
    }
}
