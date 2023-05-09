import java.util.Scanner;

public class sumMatrix {
    public static void main(String[] args) {
        //输入两个n行m列的矩阵A和B，输出它们的和A+B。
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] A=new int[n][m];
        int[][] B=new int[n][m];
        int[][] C=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                B[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
