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
