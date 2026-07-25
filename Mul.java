import java.util.Scanner;
class Mul {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int num = Math.abs(no);
        int sum = 1;
        while (no > 0) {
            sum = sum * (no % 10);
            no = no / 10;
        }
        System.out.println("Product is : " + sum);
    }
}