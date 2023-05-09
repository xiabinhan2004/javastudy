import java.util.Scanner;

public class sayreverse {
    public static void main(String[] args)  {
        //给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.split(" ");
        for(int i=str1.length-1;i>=0;i--){
            System.out.print(str1[i]+" ");
        }
        
    }
}
