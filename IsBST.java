/*
Author:  Ajeet Kumar
         14/02/2018
Problem: Is Binary Search Tree(BST)
*/
int isBST(Node root)  
    {
        if(isIt(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) return 1;
        return 0;
    }
    boolean isIt(Node root,int min,int max){
        if(root==null) return true;
        if(root.data<=min || root.data>=max){
            return false;
        }
     return(isIt(root.left,min,root.data)&&isIt(root.right,root.data,max));
    }
