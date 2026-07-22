import java.util.Scanner;

public class Discount{
    public static void main(String[] args)
     {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter purchase amount:");
        int purc=scan.nextInt();
        String d="";
        float amt=0f;
        scan.close();
        
             
            if(purc<=999)
               { amt=0;
                System.out.println("d:you have no discount");
               }
            else if (purc>=1000 && purc<=1999)
                {
                    amt=purc*(5.0f/100.0f);
                System.out.println("d:you have 5% discount");   
                }
                else if (purc>=2000 && purc<=3999)
             {
                amt=purc*(7.0f/100.0f);
                System.out.println("d:you have 7% discount");
             }
             else if (purc>=4000 && purc<=6000)
                {
                amt=purc*(8.0f/100.0f);
                System.out.println("d:you have 8% discount");
            } 
        else
            {
            amt=purc*(10.0f/100.0f);
            System.out.println("d:you have 10% discount");
        }
    System.out.println("total amount:"+purc);
     System.out.println("Discount amount:"+amt);
    }
}