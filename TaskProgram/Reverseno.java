import java.util.Scanner;
public class Reverseno {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter N Value");
        int n=scan.nextInt();   //1234
        int r=0;
        while(n!=0)      //1234             123         12          1
        {
            int rem=n%10;//4                 3            2          1
            r=r*10+rem;  //0+4               40+3        430+2       4320+1
            n=n/10;      //123               12            1          0
        }
        System.out.println("The Reverse Number is:"+r);
        scan.close();
    }
}
