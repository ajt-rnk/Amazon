/*
Author:  Ajeet Kumar
         16/02/2018
Problem: deleteAllOccurances function deletes all occurences of a key x present in the linked list.
*/
class GfG
{
    Node deleteAllOccurances(Node head, int x)
    {
        Node dummy=new Node(0);
        dummy.next=head;
        Node temp=dummy.next,prev=dummy;
        while(temp!=null){
            if(temp.data==x){
                prev.next=temp.next;
            } else{
            prev=temp;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}
