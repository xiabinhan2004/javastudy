import java.util.Scanner;

public class pascalTriangle {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

int m = scanner.nextInt();

for (int i = 0; i < m; i++) {
int n = scanner.nextInt();
printPascalTriangle(n);
}
scanner.close();
}

// 计算杨辉三角形中第i行、第j个数的值
public static int getPascalTriangleValue(int i, int j) {
if (j == 1 || j == i) {
return 1;
} else {
return getPascalTriangleValue(i - 1, j - 1) + getPascalTriangleValue(i - 1, j);
}
}

// 打印n行杨辉三角形
public static void printPascalTriangle(int n) {
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (int j = 1; j <= i; j++) {
int value = getPascalTriangleValue(i, j);
System.out.printf("%d ", value);
}
System.out.println();
}
}
}