import java.util.Scanner;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in);
int no=sc.nextInt();
int sum=0;
for(int i=1;i<no;i++)
{ 
	if(no%i ==0)
	sum=sum+i;
}
if(sum==no)
System.out.println("Perfect No : " + no); 
else
System.out.println("Not Perfect No : " + no); 
}
} 