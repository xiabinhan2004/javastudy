import java.util.Scanner;

public class reversestring{
    public static void main(String[] args) {
        //写一个函数，使输入的一个字符串（少于80个字符）按反序存放，在主函数中输入输出字符串。
        Scanner sc=new Scanner(System.in);
        String getString = sc.nextLine();
        StringBuilder reverseString = new StringBuilder(getString).reverse();
        String geString2=reverseString.toString();
        System.out.println(getString.equals(geString2)? "yes":"no");
    }
}