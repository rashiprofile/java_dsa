public class swap {
    public static void main(String[] args) {
        int a=10,b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap a & b : "+a+" "+b);
    }
}
