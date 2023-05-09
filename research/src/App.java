import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[]args)
    {
        Scanner AB=new Scanner(System.in);
        Random random=new Random();
        int x=0;
        while(x!=1)
        {
            System.out.print("剪刀输入1，石头输入2，布输入3\n");
            int sum1=0,sum2=0;
            while(sum1!=3&&sum2!=3)
            {
                int a=AB.nextInt();
                if(a>=4)
                {
                    System.out.printf("不可以输入%d,请重新输入!!\n",a);
                }
                else
                {
                    int computer=0;
                    computer=1+Math.abs(random.nextInt())%3;
                    String ch=" ";
                    if(computer==1)
                    {
                        ch="剪刀";
                    }
                    else if(computer==2)
                    {
                        ch = "石头";
                    }
                    else if(computer==3)
                    {
                        ch="布";
                    }
                    System.out.println("电脑："+ch);
                    if(computer==1&&a==1)
                    {
                        System.out.println("平局");
                        System.out.printf("当前得分为 电脑：%d 您：%d\n",sum1,sum2);
                    }
                    else if(computer==1&&a==2)
                    {
                        System.out.println("您获胜了分数+1");
                        sum2++;
                        System.out.printf("当前得分为 电脑：%d 您：%d\n",sum1,sum2);
                    }
                    else if(computer==1&&a==3)
                    {
                        System.out.println("您输了，电脑分数+1");
                        sum1++;
                        System.out.printf("当前得分为 电脑：%d 您：%d\n",sum1,sum2);
                    }
                    else if(computer==2&&a==1)
                    {
                        System.out.println("您输了，电脑分数+1");
                        sum1++;
                        System.out.printf("当前得分为 电脑：%d 您：%d\n",sum1,sum2);
                    }
                    else if(computer==2&&a==2)
                    {
                        System.out.println("平局");
                    }
                    else if(computer==2&&a==3)
                    {
                        System.out.println("您获胜了分数+1");
                        sum2++;
                        System.out.printf("当前得分为 电脑：%d 您：%d\n",sum1,sum2);
                    }
                    else if(computer==3&&a==1)
                    {
                        System.out.println("您获胜了分数+1");
                        sum2++;
                        System.out.printf("当前得分为 电脑：%d 您：%d\n",sum1,sum2);
                    }
                    else if(computer==3&&a==2)
                    {
                        System.out.println("您输了，电脑分数+1");
                        sum1++;
                        System.out.printf("当前得分为 电脑：%d 您：%d\n",sum1,sum2);
                    }
                    else
                    {
                        System.out.println("平局");
                        System.out.printf("当前得分为 电脑：%d 您：%d\n",sum1,sum2);
                    }
                }
            }
            System.out.print("\n\n");
            if(sum1>sum2)
            {
                System.out.println("很遗憾，您输了");
            }
            else
            {
                System.out.print("恭喜你获胜了\n");
            }
            System.out.printf("游戏结束，电脑得分：%d，您的得分:%d\n",sum1,sum2);
            System.out.println("继续游戏输入1，退出游戏输入任意数字");
            int g=AB.nextInt();
            if(g==1)
            {
                sum1=0;
                sum2=0;
            }
            else {
                x=1;
            }
        }

    }
}
