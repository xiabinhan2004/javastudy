import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        //逆序
        Scanner sc=new Scanner(System.in);
            String words=new String();
            words=sc.nextLine();
        while(!words.equals("0"))
        {
            
            StringBuilder sb=new StringBuilder(words).reverse();
            if(sb.charAt(0)=='0')
            {
                sb.deleteCharAt(0);
            }
            System.out.println(sb);
            words = sc.nextLine();
            
        }
        sc.close();
    }
}
