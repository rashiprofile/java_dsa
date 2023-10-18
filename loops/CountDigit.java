public class CountDigit {
    public static void main(String[] args) {
        int n=1234,s=0;
        for (int i = n; i>0 ; i/=10) {
            s++;
        }
        System.out.println("No. of digits: "+s);
    }
}
