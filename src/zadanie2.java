import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String str1 = scan.nextLine();
        System.out.print("Введите строку 2: ");
        String str2 = scan.nextLine();
        if (str1.equals(str2)){
            System.out.println("строки идентичны");
        } else {
            System.out.println("строки неидентичны");
        }
    }
}
