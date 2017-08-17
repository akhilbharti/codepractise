class insertionList
{
  Node head;
  static class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data=d;
      next=null;
    }
  }
  public void printlist()
  {
    Node n=head;
    while (n!=null)
    {
      System.out.print(n.data+" ");
      n=n.next;
    }
  }
  public void push(int new_data)
  {
    Node new_node=new Node(new_data);
    new_node.next=head;
    head=new_node;

  }
public static void main(String[] args) {
  insertionList llist=new insertionList();
  llist.head=new Node(1);

  Node second=new Node(2);
  Node third=new Node(3);
  llist.head.next=second;
  second.next=third;
  llist.push(4);
  llist.push(5);
  llist.printlist();
}

}
