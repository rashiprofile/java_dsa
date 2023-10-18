
public class SumOfDigits {
    public static void main(String[] args) {
    
        int n=1234,s=0;
        for (int i = n; i>0 ; i/=10) {
            s=s+(i%10);
        }
        System.out.println("Sum of digits: "+s);
    }
}
