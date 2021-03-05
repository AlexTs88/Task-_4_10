import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        N = sc.nextInt();
        sc.close();

        int size = 0, number = N;
        while (number > 0) {
            number /= 10;
            size ++;
        }

        System.out.println("Массив из цифр чила " + N + ":");
        int[] a = new int[size];
        for (int i = a.length - 1; i >= 0; i --) {
            a[i] = N % 10;
            N /= 10;
        }
        System.out.println(Arrays.toString(a));
    }
}
