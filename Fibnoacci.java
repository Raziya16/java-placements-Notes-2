import java.util.Scanner;
class Fibnoacci {
     public static void main (String[] args) throws java.lang.Exception {
          Scanner sc = new Scanner(System.in);
          int no = sc.nextInt();
          int f1 = 0, f2 = 1, f3 = 0;
          for (int i = 1; i <= no; i++) {
               f3 = f1 + f2;
               System.out.print(f3 + " ");
               f1 = f2;
               f2 = f3;
          }
     }
}