import java.util.Scanner;

public class Homework4 {

    // 재귀호출 버전
    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        int small = Math.min(m, n);
        int large = Math.max(m, n);
        if (small == 0) {
            return large;
        }
        return gcd(small, large % small);
    }

    // 반복문 버전
    static int gcdLoop(int m, int n) {
        while (n != 0) {
            int small = Math.min(m, n);
            int large = Math.max(m, n);
            if (small == 0) {
                return large;
            }
            m = small;
            n = large % small;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수: ");
        int a = sc.nextInt();
        System.out.print("두 번째 수: ");
        int b = sc.nextInt();

        System.out.println("최대공약수: " + gcd(a, b));
        System.out.println("최대공약수(반복문): " + gcdLoop(a, b));
        sc.close();
    }
}