import java.util.Scanner;
public class ElementExist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc nextInt();
        }
        int target = sc.nextInt();
        boolean exists = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                exists = true;
                break;
            }
        }   
        System.out.println("Exists: " + exists);
        sc.close();
    }
}


