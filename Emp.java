 class Emp
{
public Emp()
{
this("CHARAN SAI");
System.out.println("Welcome to ABC Solution");
}
public Emp(String Ename)
{
System.out.println("Hi...." +Ename+",You are appointed");
}
public Emp(String dept, int salary)
{
System.out.println("Department: "+dept+"\n your basic salary is :"+salary);
}
}