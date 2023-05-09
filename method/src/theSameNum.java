import java.util.Scanner;

public class theSameNum {
    public static void main(String[] args) {
        //输出一个整数序列中与指定数字相同的数的个数。
        Scanner sc=new Scanner(System.in);
        int lenth=sc.nextInt();
        int[] num=new int[lenth];
        for (int i = 0; i < lenth; i++) {
            num[i]=sc.nextInt();
        }
        int com = sc.nextInt();
        int cnt = extracted(num, com);
        System.out.println(cnt);
        sc.close();
    }

    private static int extracted(int[] num, int com) {
        int cnt=0;
        for (int i : num) {
            if(i==com){
                cnt++;
            }
        }
        return cnt;
    }
}
