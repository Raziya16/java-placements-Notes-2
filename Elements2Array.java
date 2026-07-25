import java.util.Scanner;
public class Elements2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        
        System.out.print("Common elements: ");
        for (int i = 0; i < n1; i++) {
            boolean inArr2 = false;
            for (int j = 0; j < n2; j++) {
                if (arr1[j] == arr2[i]) {
                    inArr2 = true;
                    break;
                }
            }
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (arr1[k] == arr1[i]) {
                        alreadyprinted = true;
                        break;
                    }
                }
                if (inArr2 && !alreadyPrinted) {
                    System.out.print(arr1[i] + " ");
                }    
        }
        sc.close();
    }
}
