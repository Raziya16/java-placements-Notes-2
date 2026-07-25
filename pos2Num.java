import java.util.Scanner;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in); 
 
System.out.print("Enter Nooo  : "); 
int no=sc.nextInt();
int term=0;
for(int i=no;i>=-no;i--)
{ 
if(i>0)
{ 
System.out.print(-(i*i)+ " , ");
}
else
{
System.out.print ( i*i+ " ");
}
} 
}
} 