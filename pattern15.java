import java.util.Scanner;
class pattern15
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        int sq=no*no;
        if(no%10==sq%10)
         System.out.println(no+"is automorphic no");
        else
            System.out.println(no+"is not automorphic no");
    }
}