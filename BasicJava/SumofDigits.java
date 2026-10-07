import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n Value");
        long n=scan.nextLong();       //1234
        long r,s=0;     //r=remainder,s=sum
        while(n!=0)     //1234  123  12  1  0
        {
            r=n%10;    //4     3   2   1
            n=n/10;    //123  12   1   0
            s=s+r;     //0+4  4+3  7+2 9+1
        }
        System.out.println("Sum of Digits:" +s);
        scan.close();

    }
}
