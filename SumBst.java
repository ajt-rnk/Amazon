/*
Author:  Ajeet Kumar
         14/02/2018
Problem: Add all greater values to nodes of tree.
*/
 static int sum;
    void modify(Node root)
    {
	sum=0;
	toModify(root);
    }
    void toModify(Node root)
    {
	if(root==null) return ;
	toModify(root.right);
	sum+=root.data;
	root.data=sum;
	toModify(root.left);
    }
