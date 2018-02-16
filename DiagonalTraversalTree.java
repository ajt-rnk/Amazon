/*
Author:  Ajeet Kumar
         16/02/2018
Problem: Diagonal Traversal of Binary Tree.
*/
class GfG
{
     public void diagonalPrint(TreeNode root)
      {
        if(root==null) return ;
        Map< Integer,List<Integer> > map =new TreeMap<>();
        mapDiagonal(root,0,map);
        for(Integer i : map.keySet()){
            List<Integer> list=map.get(i);
            for(Integer c : list){
                System.out.print(c+" ");
            }
        }
    }
    public void mapDiagonal(TreeNode root,int level,Map<Integer,List<Integer> > map){
        if(root==null){
            return ;
        }
        if(map.get(level)==null){
            map.put(level,new ArrayList<Integer>());
        }
        map.get(level).add(root.data);
        mapDiagonal(root.left,level+1,map);
        mapDiagonal(root.right,level,map);
    }
}
