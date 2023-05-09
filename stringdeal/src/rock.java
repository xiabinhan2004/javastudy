import java.util.Scanner;

public class rock {
    public static void main(String[] args) {
        //石头剪子布
        Scanner sc=new Scanner(System.in);
        String ti=sc.nextLine();
        Integer n = Integer.valueOf(ti);
        String[] a = new String[n];
        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            String[] ab = sc.nextLine().split(" ");
            a[i] = ab[0];
            b[i] = ab[1];
        }
        for (int i = 0; i < n; i++) {
            if (a[i].equals(b[i])) {
                System.out.println("Tie");
            } else if (a[i].equals("Rock")) {
                if (b[i].equals("Scissors")) {
                    System.out.println("Player1");
                } else {
                    System.out.println("Player2");
                }
            } else if (a[i].equals("Paper")) {
                if (b[i].equals("Rock")) {
                    System.out.println("Player1");
                } else {
                    System.out.println("Player2");
                }
            } else if (a[i].equals("Scissors")) {
                if (b[i].equals("Paper")) {
                    System.out.println("Player1");
                } else {
                    System.out.println("Player2");
                }
            }
        }

    }
}
