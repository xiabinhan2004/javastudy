import java.util.Arrays;
import java.util.Scanner;

public class maxChangemin {
    public static void main(String[] args) {
        //输入一个正整数n(1<n<=10)，再输入n个整数，将最大数和最小数交换后输出。
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        int[] a=new int[num];
        for(int i=0;i<num;i++){
            a[i]=n.nextInt();
        }
        int[] b=Arrays.copyOf(a, num);
        Arrays.sort(b);
        int max=b[num-1];
        int min=b[0];
        for(int i=0;i<num;i++){
            if(a[i]==max){
                a[i]=min;
            }
            else if(a[i]==min){
                a[i]=max;
            }
        }
        for(int i=0;i<num;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
