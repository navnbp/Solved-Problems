package Tree;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;



public class SymmetricTree {

	
public boolean isSymmetric(TreeNode root) {
       
	if(root == null)
		return true;
	else 
		return	checkSymmetric(root.left,root.right);
		
		
    }

public boolean checkSymmetric(TreeNode left,TreeNode right)
{
	if(left==null && right==null)
		return true;
	else if(left==null || right==null)
		return false;
	else
	{
		return left.val==right.val && checkSymmetric(left.left,right.right) && checkSymmetric(left.right, right.left);
	}
		
}



public boolean isSymmetricUsingQ(TreeNode root) {
    
	if(root == null)
		return true;
	Queue<TreeNode> q= new LinkedList<TreeNode>();
	if(root.left!=null && root.right!=null)
	{
		q.add(root.left);
		q.add(root.right);
	}else
		return false;
	
	while(!q.isEmpty())
	{
		if(q.size()<2)
			return false;
		TreeNode left=q.poll();
		TreeNode right=q.poll();
		if(left!=null && right !=null)
			continue;
		else if(left!=null || right !=null)
			return false;
		else if(left.val==right.val)
		{
			q.add(left.left);
			q.add(right.right);
			q.add(left.right);
			q.add(right.left);
			
		}else
			return false;
		
		
	}
	return true;
	
		
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SymmetricTree obj= new SymmetricTree();
		

	}

}
