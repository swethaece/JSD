import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your age:");
        int age=scan.nextInt();
        if (age>=18) {
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
        scan.close();
    }
}
