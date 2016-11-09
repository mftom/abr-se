package ABR;

public class ABR {
	
	public Node root;
	
	public ABR() {
		this.root = null;
	}
	
	public boolean isEmpty() {
		if (this.root == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insert (int value) {
		Node newNode = new Node(value);
		if(root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true) {
			parent = current;
			if(value<current.data) {
				current = current.left;
				if(current == null) {
					parent.left = newNode;
					return ;
				}
			}else{
				current = current.right;
				if(current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public int nbElements(Node nextnode) {
		int nbnodes = 1;
		if (nextnode == null) { 
			return 0;
		}
		if (nextnode.left != null) {
			nbnodes += nbElements(nextnode.left);
		}
		if (nextnode.right != null) {
			nbnodes += nbElements(nextnode.right);
		}
		return nbnodes;
	}	
	
	public boolean contains(int value) {
		Node current = root;
		while (current != null) {
			if (current.data == value) {
				return true;
			}else if(current.data > value){
				current = current.left;
			}else if(current.data < value){
				current = current.right;
			}
		}
		return false;
	}
	
	public void toList(java.util.List<java.lang.Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			this.insert(l.get(i));
		}
	}


}
