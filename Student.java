import java.util.Scanner;
class Node
{
int rollno;
String name;
Node next;
public Node(int rollno, String name)
{
this.rollno=rollno;
this.name=name;
this.next=null;
}
}
class LinkedList1
{
Node head;
Node insertBegin(int rollno,String name, Node head)
{
Node nnode = new Node(rollno,name);
nnode.next=head;
return nnode;
}
Node insertEnd(int rollno,String name, Node head)
{
Node nnode = new Node(rollno,name);
if(head==null)
return nnode; // creating first node (head node)

Node cur=head;
while(cur.next!=null)
{
cur=cur.next;
}
cur.next=nnode;// creating from second node...
return head;
}
Node insertPos(int rollno,String name, Node head,int pos)
{
Node nnode = new Node(rollno,name);
if(head==null)
return nnode; // creating first node (head node)

if(pos==1) // use login of insertBegin
{
nnode.next=head;
return nnode;
}
Node temp=head;
for(int i=1;temp!=null && i<pos-1;i++)
{
temp=temp.next;
}

if(temp!=null)
{
nnode.next=temp.next;
temp.next=nnode;
}
return head;
}

void display(Node head)
{
if(head==null)
{
System.out.println("No records ");
return;
}
while(head!=null)
{
System.out.println("Roll No : " + head.rollno + " - Name : " + head.name);
head=head.next;
}
}
public static void main(String args[])
{
LinkedList1 lst=new LinkedList1();
Scanner sc=new Scanner(System.in);
do
{
System.out.println("\t\t\t------ Menu ------");
System.out.println("1. Insert in beginning");
System.out.println("2. Insert at the end");
System.out.println("3. Insert in the position");
System.out.println("4. Display");
System.out.println("5. Delete");
System.out.println("6. Length");
System.out.println("7. Reverse");
System.out.println("8. Sum of elements");
System.out.println("9. Search");
System.out.println("10. Min and Max");
System.out.println("11. Sort ");
System.out.println("12. Exit");

System.out.print("Choose Option :");
String n=sc.next();
switch(n)
{
case "1":
System.out.print("Enter Rollno and Name : ");
lst.head=lst.insertBegin(sc.nextInt(),sc.next(),lst.head);
System.out.println("Record Inserted at the beginning");
break;
case "2":
System.out.print("Enter Rollno and Name : ");
lst.head=lst.insertEnd(sc.nextInt(),sc.next(),lst.head);
System.out.println("Record Inserted at the end");
break;
case "3":
System.out.print("Enter Position : ");
int pos=sc.nextInt();
System.out.print("Enter Rollno and Name : ");
lst.head=lst.insertPos(sc.nextInt(),sc.next(),lst.head,pos);
System.out.println("Record Inserted at the Position");
break;
case "4":
lst.display(lst.head);
break;
}
System.out.print("Do you want to continue (Y/N) ?");
}while(sc.next().equalsIgnoreCase("Y"));
}

}