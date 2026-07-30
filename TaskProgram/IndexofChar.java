import java.util.Scanner;

public class IndexofChar {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a name");
        String name=scan.next();
        int len=name.length();
        int cnt=0;
        char ch =scan.next().charAt(0);
        for(int i=0;i<len;i++)
        {
            if(name.charAt(i)==ch){
                System.out.println("the index of char:"+i);
                cnt++;    
            }
        }
        if(cnt==0)
            {
                System.out.println("the index of char not found");
            }
    }
}
