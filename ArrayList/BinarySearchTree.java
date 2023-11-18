import java.util.*;
import org.w3c.dom.Node;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
	}
	public static boolean isBST(BinaryTreeNode root) {
		if(root==null)
			return true;
		int rightmin=minimum(root.right);
		int leftmax=maximum(root.left);
		if(root.data<=leftmax) {
			return false;
		}
		if(root.data>rightmin) {
			return false;
		}
		boolean isLeftBST=isBST(root.left);
		boolean isRightBST=isBST(root.right);
		if(isLeftBST&&isRightBST) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int minimum(Node root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));  
	}
	public static int maximum(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
		
}
}