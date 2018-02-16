/*
Author:  Ajeet Kumar
         16/02/2018
Problem: Print a Binary Tree in Vertical Order. Each vertical seperated by $ symbol. 
*/
class GfG
{
    void verticalOrder(Node root) 
    {
        if(root==null) return ;
        Map< Integer,List<Integer> > map =new TreeMap<>();
        mapVertical(root,0,map);
        for(Integer i : map.keySet()){
            List<Integer> list=map.get(i);
            for(Integer c : list){
                System.out.print(c+" ");
            }
            System.out.print("$");
        }
    }
    public void mapVertical(Node root,int level,Map<Integer,List<Integer> > map){
        if(root==null){
            return ;
        }
        if(map.get(level)==null){
            map.put(level,new ArrayList<Integer>());
        }
        map.get(level).add(root.data);
        mapVertical(root.left,level-1,map);
        mapVertical(root.right,level+1,map);
    }
    
}
	
