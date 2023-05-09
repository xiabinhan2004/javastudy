import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args){
        //输入一个n行m列的矩阵A，输出它的转置AT。
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] A=new int[n][m];
        int[][] AT=new int[m][n]    ;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                AT[j][i]=A[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(AT[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();


    }
}
