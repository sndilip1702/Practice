package misc;

public class BST {

	private class BSTNode {
		private int data;
		private BSTNode left,right;
		public BSTNode(){
			left = right = null;
			data = 0;
		}
		public BSTNode(int n){
			left = right = null;
			data = n;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public BSTNode getLeft() {
			return left;
		}
		public void setLeft(BSTNode left) {
			this.left = left;
		}
		public BSTNode getRight() {
			return right;
		}
		public void setRight(BSTNode right) {
			this.right = right;
		}
	}
	
	private BSTNode root;

	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}

	public BST(){
		root = null;
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public void insert(int data){
		root = insert (root,data);
	}
	
	public BSTNode insert(BSTNode node,int data){
		if(node == null){
			node = new BSTNode(data);
		}
		else{
			if(data<node.getData()){
				node.left = insert(node.left, data);
			}
			else{
				node.right = insert(node.right, data);
			}
		}
		return node;
	}
	
	public void delete(int d){
		if(isEmpty())
			System.out.println("Tree is empty");
		else if(search(d) == false)
			System.out.println("Element not found");
		else {
			root = delete(root,d);
			System.out.println(d+" has been deleted");
		}
	}
	
	public BSTNode delete(BSTNode root, int k){
		BSTNode p,p2,n;
		if(root.getData() == k){
			BSTNode lt,rt;
			lt = root.getLeft();
			rt = root.getRight();
			if(lt == null && rt == null){
				return null;
			}
			else if(lt == null){
				p = rt;
				return p;
			}
			else if(rt == null){
				p = lt;
				return p;
			}
			else{
				p = p2 = rt;
				while(p.getLeft() != null)
					p = p.getLeft();
				p.setLeft(lt);
				return p2;
			}
		}
		if(k < root.getData()){
			n = delete(root.getLeft(), k);
			root.setLeft(n);
		}
		else{
			n = delete(root.getRight(), k);
			root.setRight(n);
		}
		
		return root;
	}
	
	public boolean search(int val){
		return search(root,val);
	}
	
	 private boolean search(BSTNode r, int val)
     {
         boolean found = false;
         while ((r != null) && !found)
         {
             int rval = r.getData();
             if (val < rval)
                 r = r.getLeft();
             else if (val > rval)
                 r = r.getRight();
             else
             {
                 found = true;
                 break;
             }
             found = search(r, val);
         }
         return found;
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
}


