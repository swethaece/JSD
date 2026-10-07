import java.util.Scanner;

public class Ebbilll {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Unit:");
        int unit=scan.nextInt();
        float amt=0.0f;
        if(unit<=500)
        {
            if (unit<=200) 
                amt=0;
            else if(unit>=201 && unit<=400)
                amt=(unit-200)*4.70f;
            else
                amt=(unit-400)*6.30f + (200*4.70f);
        }
        else{
           /*  if(unit<=100)
                amt=0;
            else if(unit>=101 && unit<=400)
                amt=(unit-100)*4.0f;
            else if(unit>=401 && unit <=500)
                amt=(unit-400)*6.30f + (300*4.70f);
            else*/

                amt=(unit-500)*8.40f + 300*4.70f + 100*6.30f;
        }
        System.out.println("total eb amount: rs"+amt);
        scan.close();
    }
}
