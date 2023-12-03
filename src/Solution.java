import java.util.*;

public class Solution {

    private static boolean flag;
    private static int H, B;

    static {
        Scanner scanner = new Scanner(System.in);
        final int B = scanner.nextInt();
        final int H = scanner.nextInt();
        scanner.close();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else
            System.out.printf("%d", H * B);
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
