import java.util.Scanner;

public class sumsiteElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[][] A=new int[m][m];
        //输出主对角线 副对角线 元素和
        int sum1=0;
        int sum2=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
                if(i==j){
                    sum1+=A[i][j];
                }
                if(i+j==m-1){
                    sum2+=A[i][j];
                }
            }
        }
        System.out.println(sum1+" "+sum2);
        sc.close();
    }
}
