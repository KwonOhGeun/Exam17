import java.util.Scanner;

public class Exam17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, c, d;
        int result;

        System.out.printf("첫번째 값을 입력하세요 ==> ");
        a = s.nextInt();
        System.out.printf("두번째 값을 입력하세요 ==> ");
        b = s.nextInt();
        System.out.printf("세번째 값을 입력하세요 ==> ");
        c = s.nextInt();
        System.out.printf("네번째 값을 입력하세요 ==> ");
        d = s.nextInt();

        result = a + b + c + d;
        System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);

    }
}
