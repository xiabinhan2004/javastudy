import java.math.BigInteger;
import java.util.Scanner;

public class shulie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int a=sc.nextInt();
            int n=sc.nextInt();
            BigInteger ans=new BigInteger("0");
            String add="";
            for (int i = 0; i < n; i++) {
                add=add+a;
                ans=ans.add(new BigInteger(add));
                
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
