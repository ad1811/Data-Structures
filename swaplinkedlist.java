import java.util.*;
public class main
{
    static class linkedlist
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
        void push(int data)
        {
            node temp = new node(data);
            temp.next = head;
            head = temp;
        }
        public void swapNodes(int x, int y) 
    { 
        // Nothing to do if x and y are same 
        if (x == y) return; 
  
        // Search for x (keep track of prevX and CurrX) 
        Node prevX = null, currX = head; 
        while (currX != null && currX.data != x) 
        { 
            prevX = currX; 
            currX = currX.next; 
        } 
  
        // Search for y (keep track of prevY and currY) 
        Node prevY = null, currY = head; 
        while (currY != null && currY.data != y) 
        { 
            prevY = currY; 
            currY = currY.next; 
        } 
  
        // If either x or y is not present, nothing to do 
        if (currX == null || currY == null) 
            return; 
  
        // If x is not head of linked list 
        if (prevX != null) 
            prevX.next = currY; 
        else //make y the new head 
            head = currY; 
  
        // If y is not head of linked list 
        if (prevY != null) 
            prevY.next = currX; 
        else // make x the new head 
            head = currX; 
  
        // Swap next pointers 
        Node temp = currX.next; 
        currX.next = currY.next; 
        currY.next = temp; 
    } 
        public void printList() 
    { 
        node tNode = head; 
        while (tNode != null) 
        { 
            System.out.print(tNode.data+" "); 
            tNode = tNode.next; 
        } 
    } 
    }
    public static void main(String args[])
    {
        linkedlist root = new linkedlist();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root.push(sc.nextInt());
        }
        root.swap(2,4);
        root.printList();
    }
}
