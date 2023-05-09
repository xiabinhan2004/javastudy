import java.util.Scanner;

public class changeMaxAndSmall {
    public static void main(String[] args) {
        //输入一个正整数n(1<n<=10)，再输入n个整数，将最大数和最小数交换后输出。
        Scanner sc=new Scanner(System.in);
        int nextInt = sc.nextInt();
        int[] num=new int[nextInt];
        for (int i = 0; i < nextInt; i++) {
            num[i]=sc.nextInt();
        }
        int min=0;
        int max=0;
        for (int i = 0; i < nextInt; i++) {
            if(num[i]<num[min])
            {
                min=i;
            }
            if(num[i]>num[max])
            {
                max=i;
            }
        }
        int temp=num[min];
        num[min]=num[max];
        num[max]=temp;
        for (int i = 0; i < nextInt; i++) {
            System.out.print(num[i]+" ");
        }
        sc.close();
    }
}
