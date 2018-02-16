/*
Author:  Ajeet Kumar
         16/02/2018
Problem: Bottom view ob binary tree.
*/
 class GfG
{
    public void bottomView(Node root)
    {
        if(root==null) return ;
        Map<Integer,Integer> map =new TreeMap<>();
        mapBottom(root,0,map);
        for(Integer i : map.keySet()){
            System.out.print(map.get(i)+" ");
        }
    }
    public void mapBottom(Node root,int level,Map<Integer,Integer> map){
        if(root==null){
            return ;
        }
        map.put(level,root.data);
        mapBottom(root.left,level-1,map);
        mapBottom(root.right,level+1,map);
    }
}
	
