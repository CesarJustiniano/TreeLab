package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedBinaryTree2;

public abstract class TreeTester8 {

	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 
		LinkedBinaryTree<Integer> tClone = t.clone();
		
		
		
		// display content as a tree
		Utils.displayTree("The original binary tree is: ", t); 
		
		// display content as a tree
		Utils.displayTree("The clone binary tree is: ", tClone); 
		
	}

}
