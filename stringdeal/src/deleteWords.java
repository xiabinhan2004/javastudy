import java.util.Arrays;
import java.util.Scanner;

public class deleteWords{
    public static void main(String[] args) {
        //删除字符串中指定字符
        Scanner sc=new Scanner(System.in);
        int ti = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < ti; i++) {
            String str = sc.nextLine();
            String[] get = str.split(" ");
            char[] compare = get[1].toCharArray();
            char[] ch = str.toCharArray();
            for (int j = 0; j < get[0].length(); j++) {
                for (int j2 = 0; j2 < compare.length; j2++) {
                    if (ch[j] == compare[j2]) {
                        ch[j] = ' ';
                }
                }
            }
            
            String result = Arrays.toString(ch).replaceAll(" |\\[|\\]|,", "");
            //bug
            result = result.substring(0, result.length() - get[1].length());
            System.out.println(result); 
        }
    }
}