import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n= scan.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
           if(n%i==0) 
            cnt++;
        }
        if(cnt==2){
            System.out.println(n+"is prime number");
        }
        else
        {
            System.out.println(n+"not a prime number");
        }
        scan.close();
    }
}
//ANOTHER METHOD

/*import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter n value");
         int n=scan.nextInt();
         int cnt=0;
         for(int i=2;i<n/2;i++)
         {
         if(n%i==0)
         {
         cnt++;
         System.out.println(n+"is not a prime number because divided by"+i);
         }
         }
         if(cnt==0)
         System.out.println(n+"is prime number");
         scan.close();
    }

}
*/