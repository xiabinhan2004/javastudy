import java.util.Scanner;

public class whichmore {
    public static void main(String[] args) {
        //请编写程序，找出一段给定文字中出现最频繁的那个英文字母。
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] num=new int[26];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                num[str.charAt(i)-'A']++;
            }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                num[str.charAt(i)-'a']++;
            }
        }
        int max=0;
        int index=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
                index=i;
            }
        }
        System.out.println((char)(index+'a')+" "+max);
    }
}
