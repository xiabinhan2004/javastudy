import java.util.Arrays;
import java.util.Scanner;

public class isSort {
    public static void main(String[] args) {
        //输入n个整数(多组数据，每组数据有两行，第1行是正整数n，第2行是n个整数)，判断这n个数是否已经排好序了（正序或逆序），已经排好序的输出“yes”，否则输出“no”(多组数据)
        Scanner n=new Scanner(System.in);
        while(n.hasNext())
        {
            int num=n.nextInt();
            int[] a=new int[num];
            
            for(int i=0;i<num;i++)
            
            {
                a[i]=n.nextInt();
            }

            int[] b = Arrays.copyOf(a, num);
            Arrays.sort(b);
            boolean flag=false,flag2=true;
            Integer[] c=new Integer[num];
            for (int i = 0; i < b.length; i++) {
                if(a[i]==b[i])
                {
                    if(i==b.length-1)
                    {
                        flag=true;
                    }

                }
                else
                {
                    for (int j = 0; j < a.length; j++) {
                        c[j]=a[j];
                    }
                    
                    Arrays.sort(c,(o1,o2)->o2-o1);
                    for (int j = 0; j < b.length; j++) {
                        if(a[j]==c[j])
                        {
                            if(j==c.length-1)
                            {
                                flag=true;
                            }
                        }
                        else
                        {
                            flag2=false;
                        }
                    }

                    
                }
            }
            if(flag&&flag2){
                System.out.println("yes");
            }
            if(!flag2)
            {
                System.out.println("no");
            }

            
        }
    }
}
        

    

