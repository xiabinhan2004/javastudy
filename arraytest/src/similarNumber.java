import java.util.Scanner;

public class similarNumber {
    public static void main(String[] args) {
        //输出一个整数序列中与指定数字相同的数的个数。
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        int[] a=new int[num];
        for(int i=0;i<num;i++){
            a[i]=n.nextInt();
        }
        int m=n.nextInt();
        int count=0;
        for(int i=0;i<num;i++){
            if(a[i]==m){
                count++;
            }
        }
        System.out.println(count);
    }
}
