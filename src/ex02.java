import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        // 3개의 정수 10,11,12를 더하여 결과를 출력하세요
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int sum = 0;
        sum = a + b + c;

        System.out.println(a + "+" + b + "+" + c + "=" + sum);
        System.out.printf("%d + %d + %d = %d" , a, b, c, sum);
        
    }
}
