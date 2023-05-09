import java.util.Scanner;

public class changeln {
    public static void main(String[] args) {
        //给定一个5×5的矩阵(数学上，一个r×c的矩阵是一个由r行c列元素排列成的矩形阵列)，将第n行和第m行交换，输出交换后的结果。
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] temp=new int[5];
        for(int i=0;i<5;i++){
            temp[i]=A[n-1][i];
            A[n-1][i]=A[m-1][i];
            A[m-1][i]=temp[i];
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        

    }
}
