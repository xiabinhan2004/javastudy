import java.util.Scanner;

public class numOfSuShu {
    public static void main(String[] args) {
        //编程求m～n(n>m，n为大于2的正整数)中有多少个素数。
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt())
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int cnt=0;
            for (int i = m; i <= n; i++) {
                if(isSushu(i))
                {
                    cnt++;
                }
            }

            System.out.println(cnt);

        }

        sc.close();
    }
    public static boolean isSushu(int num)
    {
        for (int i = 2; i < num; i++) {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
