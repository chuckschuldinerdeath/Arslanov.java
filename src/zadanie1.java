import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число а: ");
        float a = scan.nextFloat();

        System.out.print("Введите число b: ");
        float b = scan.nextFloat();

        if(a > b) {
            System.out.println("a > b");
            float summa = a + b;
            System.out.println("сумма: " + summa);
            float diff = a - b;
            System.out.println("разность: " + diff);
            float mltp = a * b;
            System.out.println("умножение: " + mltp);
            float div = a / b;
            System.out.println("деление: " + div);
        }
            else if (b > a){
                System.out.println("b > a");
                float summa = a + b;
                System.out.println("сумма: " + summa);
                float diff = b - a;
                System.out.println("разность: " + diff);
                float mltp = a * b;
                System.out.println("умножение: " + mltp);
                float div = b / a;
                System.out.println("деление: " + div);
            }
            else {
            System.out.println("b = a");
            float summa = a + b;
            System.out.println("сумма: " + summa);
            float diff = b - a;
            System.out.println("разность: " + diff);
            float mltp = a * b;
            System.out.println("умножение: " + mltp);
            float div = b / a;
            System.out.println("деление: " + div);

        }
    }
}
