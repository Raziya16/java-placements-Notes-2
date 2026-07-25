
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Duplicate elements: ");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    if (!found) {
                        System.out.print(arr[i]);
                        found = true;
                    } else {
                        System.out.print(" " + arr[i]);
                    }
                    break;
                }
            }
        }
        if (!found) {
            System.out.print("No duplicates found");
        }
        sc.close();
    }
}