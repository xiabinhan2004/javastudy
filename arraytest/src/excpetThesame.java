import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class excpetThesame {
    public static void main(String[] args) {
        //给定含有n个整数的序列，要求对这个序列进行去重操作。所谓去重，是指对这个序列中每个重复出现的数，只保留该数第一次出现的位置，删除其余位置。
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] a=new int[num];
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[num];
        int count=0;
        for(int i=0;i<num;i++){
            int flag=0;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                b[count]=a[i];
                count++;
            }

        }
        for(int i=0;i<count;i++){
            System.out.print(b[i]+" ");
        }
        
        
        


    }
}
