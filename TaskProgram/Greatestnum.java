import java.util.Scanner;

public class Greatestnum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a=scan.nextInt();
        System.out.println("enter 2nd number:");
        int b=scan.nextInt();
        if (a>b) {
            System.out.println(a+"is greater");
        }
        else{
            System.out.println(b+"is greater");
        }

    }
}
