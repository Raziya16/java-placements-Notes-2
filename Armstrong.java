import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int original = num;
        int digits = String.valueOf(num).length();

        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num /= 10;
        }
        if (sum == original)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is Not an Armstrong Number");
    }
}