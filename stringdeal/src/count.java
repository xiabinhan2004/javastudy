import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        //输入一行字符(字符总数不超过80个)，统计其中大写字母、小写字母、数字字符、空格、其他字符分别有多少个
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int upper=0;
        int lower=0;
        int number=0;
        int space=0;
        int other=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                upper++;
            }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                lower++;
            }else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                number++;
            }else if(str.charAt(i)==' '){
                space++;
            }else{
                other++;
            }
        }
        System.out.println(upper+" "+lower+" "+number+" "+space+" "+other);
        
    }
}
