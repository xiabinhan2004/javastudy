import java.util.Scanner;

public class reverseOut {
    public static void main(String[] args) {
        //输入一个正整数n(1<n<=10)，再输入n个整数，将n个数逆序输出输出。
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=n.nextInt();
        }
        
        for(int i=num-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        n.close();

    }
}
