import java.util.Scanner;

public class zuijiu {
    
    public static void main(String[] args) {
        /* 某个监狱有一排、共n间牢房，一间挨一间。每间牢房关着一名囚犯，每间牢房的门刚开始时都是关着的。
有一天晚上，狱卒厌烦了看守工作，决定玩一个游戏。游戏的第1轮，他喝了一杯酒，然后沿着监狱，把所有牢房的门挨个挨个打开；游戏的第2轮，他又喝了一杯酒，然后沿着监狱，把编号为偶数的牢房的门关着；游戏的第3轮，他又喝了一杯酒，然后沿着监狱，对编号为3的倍数的牢房，如果牢房的门开着，则关上，否则打开；...，狱卒重复游戏n轮。游戏结束后，他喝下最后一杯酒，然后醉倒了。
这时，囚犯才意识到他们牢房的门可能是开着的，而且狱卒醉倒了，所以他们越狱了。
给定牢房的数目，求越狱囚犯的人数。 */

        //输入文件的第1行为一个正整数，表示测试数据的个数。每个测试数据占一行，为一个整数n，5<=n<=100，表示牢房的数目。
        
        int m,n;
        Scanner scanner = new Scanner(System.in);
        m=scanner.nextInt();
        for(int i=1;i<=m;i++)
        {
            n=scanner.nextInt();

            System.out.printf("%d\n",(int)Math.sqrt(n));
        }
        
    }


}
