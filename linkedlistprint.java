/*
So Linked list provides the following two advantages over arrays
1) Dynamic size
2) Ease of insertion/deletion

Linked lists have following drawbacks:
1) Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do a binary search with linked lists.
2) Extra memory space for a pointer is required with each element of the list.
3) Arrays have better cache locality that can make a pretty big difference in performance.
    */
public class linkedlist
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
        }
    }

    public static void main(String args[])
    {
    linkedlist root = new linkedlist();
    root.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    root.head.next = second;
    second.next = third;
    third.next = null;
    printlist(root.head);
    }

    static void printlist(Node head)
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
}
