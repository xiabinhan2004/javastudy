import java.util.Scanner;

public class checkShudu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int flag=1;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                for(int k=j+1;k<9;k++){
                    if(A[i][j]==A[i][k]){
                        flag=0;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                for(int k=j+1;k<9;k++){
                    if(A[j][i]==A[k][i]){
                        flag=0;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                for(int k=0;k<9;k++){
                    for(int l=k+1;l<9;l++){
                        if(A[i+k/3][j+k%3]==A[i+l/3][j+l%3]){
                            flag=0;
                            break;
                        }
                    }
                }
            }
        }
        if(flag==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        sc.close();
    }
}
