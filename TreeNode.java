package BinaryTreePkg;

public class TreeNode {
	private Integer data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	
	public TreeNode(Integer data)
	{
		this.data=data;
	}
	
	public Integer getData() {
		return data;
	}

	public TreeNode find(Integer data)
	{
		if(this.data == data)
			return this;
		if(data < this.data && leftNode != null)
			leftNode.find(data);
		if(rightNode != null)
			rightNode.find(data);
		return null;
	}

	public void insert(Integer data)
	{
		if(this.data <= data)
		{
			if(this.rightNode==null)
				this.rightNode = new TreeNode(data);
			else
				this.rightNode.insert(data);
		}
		else
			if(this.leftNode == null)
				this.leftNode= new TreeNode(data);
			else
				this.leftNode.insert(data);
	}
	
	
	public TreeNode getLeftNode() {
		return leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}


	

}
