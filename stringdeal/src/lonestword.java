import java.util.Scanner;

public class lonestword {
    public static void main(String[] args) {
        //一个以'.'结尾的简单英文句子，单词之间用空格分隔，没有缩写形式和其它特殊形式
        Scanner sc=new Scanner(System.in);
        String words = sc.nextLine();
        String[] word = words.split(" ");   
        int max = 0;
        int index=0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > max) {
                max = word[i].length();
                index=i;
            }

        }
        System.out.println(word[index]);
    };
}
