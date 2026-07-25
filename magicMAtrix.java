import java.util.Scanner;
class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int arr[][]=new int[3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<3;i++)
        {
            sum=sum+arr[0][i];
        }
        
        boolean magic=true;
        for(int i=0;i<3;i++)
        {
            int row=0,col=0;
            for(int j=0;j<3;j++)
            {
                row+=arr[i][j];
                col+=arr[i][j];
            }
            if(row !=sum || col!=sum)
            {
                magic=false;
                break;
            }
        }
        if(magic)
        System.out.println("Matrix is magic");
        else
        System.out.println("Matrix is not magic");
    }
}