import java.util.Scanner;

public class Task407 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Please enter the second number");
        int b = scanner.nextInt();

        while (a%b != 0){
            int temp = a;
            a = b;
            b = temp%b;
        }
        System.out.println("Largest aliquot: " + b);
    }
}
