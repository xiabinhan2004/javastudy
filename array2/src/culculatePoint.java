import java.util.Scanner;

public class culculatePoint {
    public static void main(String[] args) {
/*         给定一个5*5的矩阵，每行只有一个最大值，每列只有一个最小值，寻找这个矩阵的鞍点。鞍点指的是矩阵中的一个元素，它是所在行的最大值，并且是所在列的最小值。

   例如：在下面的例子中（第4行第1列的元素就是鞍点，值为8 ）。

11 3 5 6 9

12 4 7 8 10

10 5 6 9 11

8 6 4 7 2

15 10 11 20 25 */
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                A[i][j]=sc.nextInt();
            }
        }
        //如果存在鞍点，输出鞍点所在的行、列及其值，如果不存在，输出"not found"。
        int flag=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int max=A[i][j];
                int min=A[i][j];
                for(int k=0;k<5;k++){
                    if(A[i][k]>max){
                        max=A[i][k];
                    }
                    if(A[k][j]<min){
                        min=A[k][j];
                    }
                }
                if(max==min){
                    System.out.println(i+1+" "+(j+1)+" "+max);
                    flag=1;
                }
            }
        }
        if(flag==0){
            System.out.println("not found");
        }
        sc.close();
        

    }
}
