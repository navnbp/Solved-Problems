package Tree;

public class StringBinaryTree {


	public static int ct=0;
	
public String tree2str(TreeNode t) {
	StringBuilder str=new StringBuilder();
	if(t==null)
		return str.toString();
	
	StringBuilder left,right;
	left=new StringBuilder(tree2str(t.left));
	right=new StringBuilder(tree2str(t.right));
	str.append(t.val);
	if(t.left!=null || t.right!=null){
		str=str.append("(").append(left).append(")");
		if(t.right!=null)
			str=str.append("(").append(right).append(")");
	}
	
	
	return str.toString();
			
    }



	
	
	public static void main(String[] args) {
		StringBinaryTree obj= new StringBinaryTree();
		
		TreeNode root=new TreeNode(1);
		
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.right=new TreeNode(4);
		System.out.println(obj.tree2str(root));
		
		

	}

}
