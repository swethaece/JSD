import java.util.Scanner;

public class SwitchDemo3 {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter 2 numbers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("add.add sub.sub mul.mul div.div remain.remainder Enter Your Choice:");
        String ch=scan.next();
        switch (ch) {
            case "add":
                System.out.println("addition:"+(a+b));
                break;
            case "sub":
                System.out.println("subtraction:"+(a-b));
                break;
            case "mul":
                System.out.println("multiplication:"+(a*b));
                break;
            case "div":
                System.out.println("division:"+(a/b));
                break;
            case "remain":
                System.out.println("remainder:"+(a%b));
                break;
            default:
                System.out.println("Enter Your Choice:");
        }
        scan.close();
  }  
}
