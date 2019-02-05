public class linkedlist
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
        if(head==null)
        {
            head = temp;
            return ;
        }
        temp.next = head;
        head = temp;
    }
    int count()
    {
        node temp = head;
        int f = 0;
        while(temp!=null)
        {
            f++;
            temp = temp.next;
        }
        return f;
    }
    int recursivecount(node temp)
    {
        if(temp==null)
        return 0;
        return 1 + recursivecount(temp.next);
    }
    public static void main(String args[])
    {
        linkedlist root = new linkedlist();
        root.push(1);
        root.push(2);
        root.push(3);
        root.push(4);
        int adi = root.count();
        System.out.println(adi + " " + root.recursivecount(root.head));
    }
}
