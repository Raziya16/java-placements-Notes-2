public class Armstrong3Digit {
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {

            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp /= 10;
            }

            if (sum == num)
                System.out.println(num);
        }
    }
}
