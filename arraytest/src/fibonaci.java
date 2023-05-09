import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
       //输入斐波那契数列第几项，输出数值
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        int a=1;
        int b=1;
        int c=0;
        if(num==1||num==2){
            System.out.println(1);
        }
        else{
            for(int i=3;i<=num;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
        
    
    }

}
