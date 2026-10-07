import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=scan.nextLine();
        System.out.println("your name:"+name);
        scan.close();
    }
}
