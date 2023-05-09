import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cntWords {
    public static void main(String[] args) {
        //输入一个英文句子，再输入一个单词，统计这个单词在这个英文句子中出现的次数(忽略大小写)        Pattern word=Pattern.compile("[a-z]+");

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String comp = sc.nextLine();
        Pattern word=Pattern.compile(comp);
        String str2 = str.toLowerCase();
        Matcher m=word.matcher(str2);
        String[] num=new String[26];
        int cnt=0;

        while(m.find()){
            cnt++;
        }
        System.out.println(cnt);

        

    }
}
