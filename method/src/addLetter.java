import java.util.Scanner;

public class addLetter {
    public static void main(String[] args) {

        extracted();

    }

    private static void extracted() {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int nextInt = sc.nextInt();
            for (int i = 0; i < nextInt; i++) {
                for (int j = 0; j < nextInt-i-1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print((char)('A'+j));
                }
                for (int j = i; j >=0; j--) {
                    System.out.print((char)('Z'-j));
                }
                sc.close();
                System.out.println();
            }

        }
    }

}
