import java.util.Scanner;

public class sumOb {
    public static void main(String[] args) {
        //输入一个整数矩阵，计算位于矩阵边缘的元素之和。所谓矩阵边缘的元素，就是第一行和最后一行的元素以及第一列和最后一列的元素。
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||i==m-1||j==0||j==n-1){
                    sum+=sc.nextInt();
            }
            else{
                sc.nextInt();
            }

        }
    }
        System.out.println(sum);
        sc.close();
}
}
