/*
Author:  Ajeet Kumar
         15/02/2018
Problem: Remove loop in Linked List if there exist.
*/
	  int removeTheLoop(Node node) {
      Node low=node,high=node;
      int result=0;
      while(high.next!=null){
          low=low.next;
          high=high.next;
          if(high.next!=null)
          high=high.next;
          if(low.data==high.data){
              result=1;
              break;
          }
      }
      low=node;
      while(result==1){
          if(high.next.data==low.next.data){
              high.next=null;
              break;
          }
          low=low.next;
          high=high.next;
      }
      return result;
}
