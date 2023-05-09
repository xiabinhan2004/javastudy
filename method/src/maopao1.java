import java.util.Arrays;
import java.util.Scanner;

public class maopao1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int zu=Integer.valueOf(sc.nextLine()) ;
        for (int i = 0; i < zu; i++) {
            String[] split = sc.nextLine().split(" ");
            String[] sort=new String[split.length-1];
            sort=Arrays.copyOfRange(split, 1, split.length);
            Arrays.sort(sort);
            String ans="";
            for (String h : sort) {
                ans=ans+h+" ";

           }
            System.out.println(ans.substring(0, ans.length()-1));

        }
        sc.close();
    }
}
