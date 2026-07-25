import java.util.Scanner;
class sum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of two numbers is: " + sum);

        sc.close();
    }
}
