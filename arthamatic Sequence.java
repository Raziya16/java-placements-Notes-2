import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int difference = sc.nextInt();
        int n = sc.nextInt();

        int term = first;

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term = term + difference;
        }

        sc.close();
    }
}