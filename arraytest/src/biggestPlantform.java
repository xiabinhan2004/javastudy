import java.util.Scanner;

public class biggestPlantform{
    public static void main(String[] args) {
        //已知一个已经从小到大排序的数组，这个数组的一个平台（Plateau）就是连续的一串值相同的元素，并且这一串元素不能再延伸。例如，在 1，2，2，3，3，3，4，5，5，6中1，2-2，3-3-3，4，5-5，6都是平台。试编写一个程序，接收一个数组，把这个数组最长的平台找出 来。在上面的例子中3-3-3就是最长的平台。
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] a=new int[num];
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        int count=1;
        for(int i=0;i<num-1;i++){
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                }
                count=1;
            }
        }
        if(count>max){
            max=count;
        }
        System.out.println(max);
        

    }
}