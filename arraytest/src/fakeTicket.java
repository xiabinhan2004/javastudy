import java.util.Scanner;

public class fakeTicket {
    public static void main(String[] args) {
        //舞会收到很多假票。要求编写程序，统计所有门票中存在假票的门票数。
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            String ln = sc.nextLine();
            String num[]=ln.split(" ");
            if(num[0]=="0"&&num[1]=="0")
            {
                break;
                
            }
            int[] tic=new int[Integer.parseInt(num[1])];
            for (int i = 0; i < tic.length; i++) {
                int t=sc.nextInt();
                tic[t]++;
            }
            

            int count=0;
            for (int i = 0; i < tic.length; i++) {
                if(tic[i]>1)
                {
                    count++;
                }
            }
            System.out.println(count);



            
        }

    }
}

