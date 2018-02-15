/*
Author:  Ajeet Kumar
         15/02/2018
Problem: Intersection Point in Y Shapped Linked Lists.
*/
class GFG
{
	int intersectPoint(Node headA, Node headB)
	{
         int result=-1,count1=0,count2=0;
         Node temp1=headA,temp2=headB;
         while(temp1.next!=null){
             temp1=temp1.next;
             count1++;
         }
         while(temp2.next!=null){
             temp2=temp2.next;
             count2++;
         }
         if(temp1.data==temp2.data){
             temp1 = count1 > count2 ? headA : headB;
             temp2 = count1 > count2 ? headB : headA;
             int diff=Math.abs(count1-count2);
             while(diff>0){
                 temp1=temp1.next;
                 diff--;
             }
             while(temp1.data!=temp2.data){
                 temp1=temp1.next;
                 temp2=temp2.next;
                 result=temp1.data;
             }
         }
         return result;
	}
}
