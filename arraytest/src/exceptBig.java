import java.util.Arrays;
import java.util.Scanner;

public class exceptBig {
    public static void main(String[] args) {
        //输出一个整数数列中不与最大数相同的数字之和（假设没有相同的数）。
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] a=new int[num];
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int sum=0;
        for (int i = 0; i < a.length-1; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
