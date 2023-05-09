import java.util.Scanner;

public class bigOfThree {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        extracted(sc);
    }

    private static void extracted(Scanner sc) {
        while(sc.hasNextLine())
        {
            String[] split = sc.nextLine().split(" ");
            int max = Math.max(Math.max(Integer.valueOf(split[0]), Integer.valueOf(split[1])), Integer.valueOf(split[2]));
            System.out.println(max);
        }
    }
}
