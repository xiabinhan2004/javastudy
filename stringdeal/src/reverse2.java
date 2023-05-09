import java.util.Scanner;

public class reverse2 {
    public static void main(String[] args) {
        //逆序
        /* 从键盘上输入一个正整数，输出其逆序，如果有前导0，还需要去掉前导0.
输入的整数为0，表示输入结束。 */
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine())
        {
            String words = sc.nextLine();
            if(words.equals("0"))
            {
                break;
            }
            StringBuilder sb=new StringBuilder(words).reverse();
            if(sb.charAt(0)=='0')
            {
                sb.deleteCharAt(0);
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
