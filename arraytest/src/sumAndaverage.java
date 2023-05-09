import java.util.Scanner;

public class sumAndaverage {
    //读入n(1≤n≤10000)个整数，求它们的和与均值。
    public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int num=n.nextInt();
    int sum=0;
    int[] a=new int[num];
    for(int i=0;i<num;i++){
        a[i]=n.nextInt();
        sum+=a[i];
    }
    //求平均值平均值(保留到小数点后5位)
    double average=(double)sum/num;
    System.out.printf("%d %.5f",sum,average);    
    }
    
    

}

