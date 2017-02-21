import java.util.Scanner;

public class CalculatorMethod {
    static int calculate (int a,int b, int c) {
        return ( a + b + c) / 3;
    }

    public static void main(String[] args) {

        System.out.println("Для получения среднее арифметического значения, введите три числа, нажимая Enter; ");
        int a , b, c;
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int sum = calculate(a,b,c);
        System.out.println ("среднее арифметическое значение этих чисел = " + sum);
    }
}
