package solution_4;



public class BST {
	PreOrdersuccQueue p=new PreOrdersuccQueue();
	TreeNode root;
	public TreeNode getRoot() {
		return root;
	}
	public void insert(int data) {                                                  //create funtion to insert element
		TreeNode node=new TreeNode(data);
		if(root==null) {
			root=node;
		}
		else {
			TreeNode temp=root;
			TreeNode parent=null;
			while(temp!=null) {
				parent=temp;
				if(data<=temp.getData()) {
					temp=temp.getLeft();
				}
					else {
						temp=temp.getRight();
					}
				}
			if(node.getData()<=parent.getData()) {
				parent.setLeft(node);
			}
				else {
					parent.setRight(node);
				}
			}
			
			}
	void traversePreOrder(TreeNode node) {                                         //traverse of tree
		if(node!=null) {
			
			 p.push(node.getData());
			System.out.print(node.getData()+" ");
		
			traversePreOrder(node.getLeft());
			traversePreOrder(node.getRight());
		}
	}
	public void  printQueue() {                                     //call preOrderSuccessor() in queue
		System.out.println();
		System.out.println("preordersuccerror to correponding element :");
		p.preOrderSuccessor();
		System.out.println("not exit");
	}
}
