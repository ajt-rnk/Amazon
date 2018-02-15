/*
Author:  Ajeet Kumar
         15/02/2018
Problem: Connect Nodes at Same Level in Tree.
*/
class GfG
{
    void connect(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        Node head=root;
        boolean not=false;
        while(!q.isEmpty()){
            root=q.remove();
            if(root!=null && root.left!=null) q.add(root.left);
            if(root!=null && root.right!=null) q.add(root.right);
            if(!not){
                head=root;
                not=true;
            } else {
                head.nextRight=root;
                head=head.nextRight;
                if(root==null){
                    not=false;
                    q.add(null);
                } 
            }
            
            if(root==null && q.peek()==null){
                        break;
                    }
        }
    }
}
