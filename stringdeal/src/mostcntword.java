import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mostcntword {
    public static void main(String[] args) {
        //输入一个英文句子，找出这个在这个英文句子中出现的次数最多的单词(忽略大小写)，如果出现次数一样多，则输出第一个
        Pattern word=Pattern.compile("[a-z]+");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2 = str.toLowerCase();
        Matcher m=word.matcher(str2);
        String[] num=new String[26];
        int cnt=0;

        while(m.find()){
            String s=m.group();
            num[cnt]=s;
            cnt++;
        }
        int max=0;
        int index=0;
        for(int i=0;i<cnt;i++){
            int count=0;
            for(int j=0;j<cnt;j++){
                if(num[i].equals(num[j])){
                    count++;
                }
            }
            if(count>max){
                max=count;
                index=i;
            }
        }
        System.out.println(num[index]);

        

    }
}
