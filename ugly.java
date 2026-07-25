import java.util.Scanner;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter No: ");
int no=sc.nextInt();
int m=no;
int arr[]={2,3,5};

for(int factor:arr)
{
    while(no%factor==0)
    {
        no=no/factor;
    }
}
if(no==1)
System.out.println(m+no+"is Ugly Number");
else
System.out.println(m+no+"is not Ugly Number");
    }
}