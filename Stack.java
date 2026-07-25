//Stack – using LinkedList
import java.util.*;

class Node
{
	 int data;
	 Node next;
	 Node(int d)
	 {
		data=d;
	 }	 
}
 class Stack
{
	 Node push(int d,Node head){  		
				Node nnode = new Node(d);				
				if(head==null)				   
					head=nnode;				
				else
				{
					nnode.next=head;					
					head=nnode;
				}
				return head;
			 }			 
			 
	 Node pop(Node head){		   
		    if(head==null)
		        System.out.println("underflow");
		   else
				head=head.next;
			return head;
		 }
	
	void display(Node head){		
				System.out.println(" list is : ");
				if(head==null){					
					System.out.println("o Nodes");			
					return;
					}
				 
				Node tmp=head;
				while(tmp!=null){						
				System.out.print(tmp.data+" ");					 
				tmp=tmp.next;
				}
				System.out.println();
	       }
    boolean isEmpty(Node head)
	{
		if(head==null)
			return true;
		else
			return false;
	}
	
	int peek(Node head)
	{
		if(head==null)
			return -1;
		return head.data;
	}	
}
public class Main
{		
		public static void main(String[] args)
		{
		Stack s=new Stack();
		Node head=null;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter No : ");
                for(int i=1;i<=sc.nextInt();i++)
			 head=s.push(in.nextInt(),head);
		 head=s.pop(head);
		System.out.println(" top element : "+ s.peek(head));
		System.out.println(" is empty : "+ s.isEmpty(head));
		s.display(head); 		
	}
}
