import java.math.BigDecimal;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        //3的倍数
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine())
        {
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            int sum = 0;
            for (int i = 0; i < ch.length; i++) {
                sum += ch[i] - '0';
            }
            if (sum % 3 == 0) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
