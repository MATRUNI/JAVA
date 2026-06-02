import java.util.LinkedList;
import java.util.Queue;

class Problem {
    public int maxLevelSum(TreeNode root) 
    {
        Queue<TreeNode> s= new LinkedList<>();
        s.offer(root);
        int result=0,max=-999999;
        int level=1;
        while(!s.isEmpty())
        {
            int size=s.size();
            int sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode node = s.poll();
                sum+=node.val;
                if(node.left!=null) s.offer(node.left);
                if(node.right!=null) s.offer(node.right);
            }
            
            if(sum>max)
            {
                max=sum;
                result=level;
            }
            level++;
        }
        return result;    
    }
}