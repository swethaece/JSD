import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.next();
        int len=name.length();
        int cnt=0;
        for(int i=0;i<len;i++)
        {
            if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || 
               name.charAt(i)=='u' );
            {
                System.out.print(" " );
                cnt++;
            }
        }
        System.out.print("    ("+cnt+")");

    }
}
