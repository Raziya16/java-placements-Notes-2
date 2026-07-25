public class Armstrong4Digit {
    public static void main(String[] args) {

        for (int num = 1000; num <= 9999; num++) {

            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, 4);
                temp /= 10;
            }

            if (sum == num)
                System.out.println(num);
        }
    }
}