import java.util.Scanner;
class pattern14
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        long[] terms=new long[no];
        terms[0]=2;
        
        System.out.print(terms[0]+" ");
        for(int i=1;i<no;i++)
        {
            long product=1;
            for(int j=0;j<i;j++)
            {
                product*=terms[j];
            }
            terms[i]=product+1;
            System.out.print(terms[i]+" ");
        }
    }
}