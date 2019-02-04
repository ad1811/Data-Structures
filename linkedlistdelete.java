class linkedlistl
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
	 void delete(int key)
	 {
		 node temp = head,prev = null;
		 if(head.data==key)
		 {
			 head = temp.next;
			 return;
		 }
		 while(temp!=null&&temp.data!=key)
		 {
			 prev = temp;
			 temp = temp.next;
		 }
		 if(temp == null) return ;
		 prev.next = temp.next;
	 }
	 void deletepos(int pos)
	 {
		 node temp = head;
		 if(head==null)
			 return;
		 for(int i=0;i<pos;i++)
			 temp = temp.next;
		 if(temp==null||temp.next==null)
			 return;
		 temp.next = temp.next.next;
		 
	 }
	}
public class linkedlistdelete extends linkedlistl {

	
	public static void main(String args[])
	{
		linkedlistl root = new linkedlistl();
		root.append(1);
		root.add(2);
		root.add(3);
		root.add(5);
		root.append(6);
		root.append(7);
		root.insertAfter(root.head.next.next.next,10);
		root.add(3);
		root.printlist();
		System.out.println("");
		root.delete(3);
		root.deletepos(3);
		root.printlist();
		
	}
}
