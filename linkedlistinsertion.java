class linkedlist
	{
		node head;
		   class node
		{
			int data;
			node next;
			node(int d)
			{
				data = d;
				next = null;
			}
		}
	
		  void insertAfter(node prevnode,int data)
		  {
			  if (prevnode == null) 
		        { 
		            System.out.println("The given previous node cannot be null"); 
		            return; 
		        } 
			  node temp = new node(data);
			  temp.next = prevnode.next;
			  prevnode.next = temp;
		  }
	 void append(int data)
	{
		 node temp = new node(data);
		if(head==null)
		{
			temp.next = null;
			head = temp;
			return;
		}
		node last = head;
		while(last.next!=null)
		{
			last = last.next;
		}
		last.next = temp;
	
	}
	 void add(int data)
	{
		node temp = new node(data);
		temp.next = head;
		head = temp;
	}
	 void printlist()
	 {
		 node temp = head;
		 while(temp!=null)
		 {
			 System.out.println(temp.data);
			 temp = temp.next;
		 }
	 }
	}
public class linkedlistinsertion extends linkedlist {

	
	public static void main(String args[])
	{
		linkedlist root = new linkedlist();
		root.append(1);
		root.add(2);
		root.add(3);
		root.add(5);
		root.append(6);
		root.append(7);
		root.insertAfter(root.head.next.next.next,10);
		root.add(3);
		root.printlist();
		
	}
}
