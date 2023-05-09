import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        //输入一个正整数n(5<n<=15)，再输入n个整数，将后面5个数排序（从小到大）后输出。
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,n-5,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }  
        sc.close();


        

        
    }
}
