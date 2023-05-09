import java.util.Scanner;

public class snakeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            int count = 1;
            for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        matrix[i-j][j] = count++;
                    }
                }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-i; j++) {
                    System.out.print(matrix[i][j]);
                    if (j < n-i-1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}