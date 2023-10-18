import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int a[]=new int [10];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
           a[i]=in.nextInt();

        }
        int m=a[0];
        for (int i = 0; i < 9; i++) {
            if(m<a[i+1])
            {
                m=a[i+1];
            }
            
        }
        System.out.println("the largest no is:-"+m);
        
    }
}
