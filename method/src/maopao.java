import java.util.Arrays;
import java.util.Scanner;

public class maopao {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] num=new int[10];
            for (int i = 0; i < 10; i++) {
                num[i]=sc.nextInt();
            }
            Arrays.sort(num);
            extracted(num);
            sc.close();
        }

        private static void extracted(int[] num) {
            String ans="";
            for (int i : num) {
                ans=ans+i+" ";
            }
            System.out.println(ans.substring(0, ans.length()-1));
        }
}
