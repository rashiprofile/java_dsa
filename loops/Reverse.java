import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] n={1,2,3,4};
        int l=n.length;
        int s=0,e=l-1,t;
        while(s<e)
        {
             t=n[s];
             n[s]=n[e];
             n[e]=t;
             s++;
             e--;
        }
        for (int i : n) {
         System.out.print(i);
        }
         sc.close();
     }
}
