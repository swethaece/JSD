/*
enter your text:
i		am		so		good
output:
i am so good
 */
import java.util.Scanner;

public class TextSpace {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Your Text");
    String text = scan.nextLine(); //scan.next=space not accept & scan.nextLine = accept space
    int length = text.length();
    String res="";
    for(int i=0;i<length-1;i++)
    {
        char c1 = text.charAt(i);
        char c2 = text.charAt(i+1);
        if(c1==' ' && c2==' ')
        continue;
        else
            res=res+c1;
    }
    System.out.println(res+text.charAt(length-1));
    scan.close();
   } 
}
