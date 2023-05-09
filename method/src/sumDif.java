import java.util.Arrays;
import java.util.Scanner;

public class sumDif {
    public static void main(String[] args) {
        //输出一个整数数列中不与最大数相同的数字之和（假设没有相同的数）。


        Scanner sc=new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] num=new int[cnt];
        for (int i = 0; i < cnt; i++) {
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        int sum=0;
        for (int i = 0; i < cnt-1; i++) {
            sum+=num[i];
        }
        System.out.println(sum);
        

        sc.close();
    }
}
