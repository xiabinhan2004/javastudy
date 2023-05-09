import java.util.Scanner;

public class checkIsupMartix {
    public static void main(String[] args) {
        //输入一个正整数n(1<=n<=6)和n阶矩阵a中的元素，如果a是上三角矩阵，输出“YES”；否则，输出“NO”（上三角矩阵，即主对角线以下的元素都为0，主对角线为从矩阵的左上角至右下角的连线）。
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] A=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>j&&A[i][j]!=0){
                    flag=1;
                }
            }
        }
        if(flag==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
        
        
    }
}
