import java.util.Scanner;

public class bigFirst {
    public static void main(String[] args) {
        /* 对一个字符串中的所有单词，如果单词的首字母不是大写字母，则把单词的首字母变成大写字母。
在字符串中，单词之间通过空白符分隔，空白符包括：空格(' ')、制表符('\t')、回车符('\r')、换行符('\n')。 */
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextLine()){
        String words = sc.nextLine();
        String[] word = words.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (word[i].charAt(0) >= 'a' && word[i].charAt(0) <= 'z') {
                word[i] = word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            }
            System.out.print(word[i]+" ");
    
        }
        System.out.println("");
    }



}
}
