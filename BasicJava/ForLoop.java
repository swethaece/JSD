//For loop example program
/*import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N value");
        int n=scan.nextInt();

        for(int i=1;i<=n;i++ )
        {
            //System.out.println(i);
            System.out.print(i +(i<n?"+":"")  );
            
        }
        scan.close();
    }
}*/

// O/p will be 1+2+3+4+5=15 : task
import java.util.Scanner;
public class ForLoop{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N value");
        int n=scan.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+i;
            System.out.print(i+"+");
        }
            System.out.print("\b="+s);
    }
}

