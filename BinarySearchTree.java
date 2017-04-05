package BinaryTreePkg;

public class BinarySearchTree {
	private TreeNode root;
	
	public void insert(Integer data)
	{
		if(root == null)
			root = new TreeNode(data);
		else
			root.insert(data);
			
	}
	public TreeNode search(Integer data)
	{	
		if(root != null)
			root.find(data);
		return null;
	}
	public void delete(Integer data)
	{
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		
		if(current == null)
			return;
		
		while(current != null && current.getData() != data)
		{
			parent =current;
			if(data < current.getData())
			{
				current = current.getLeftNode();
				isLeftChild =true;
			}
			else
			{
				current = current.getRightNode();
				isLeftChild =false;
			}
		}
		if(current ==null)
			return;
		
		if(current.getLeftNode() == null && current.getRightNode() == null)
		{
			if(current == root)
				root = null;
			else
			{
				if(isLeftChild)
				{
					parent.setLeftNode(null);
				}
				else
					parent.setRightNode(null);
			}
		}
		else if(current.getRightNode()==null)
		{
			if(current == root)
			{
				root = current.getLeftNode();
			}
			else if(isLeftChild)
			{
				parent.setLeftNode(current.getLeftNode());
			}
			else
				parent.setRightNode(current.getLeftNode());
		}
		else if(current.getLeftNode()==null)
		{
			if(current == root)
			{
				root = current.getRightNode();
			}
			else if(isLeftChild)
			{
				parent.setLeftNode(current.getRightNode());
			}
			else
				parent.setRightNode(current.getRightNode());
		}
		
	}

}
