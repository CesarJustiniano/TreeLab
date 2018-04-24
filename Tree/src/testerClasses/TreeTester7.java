package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;

public class TreeTester7 {

	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedTree<Integer> t = Utils.buildExampleTreeAsLinkedTree(); 
		LinkedTree<Integer> tClone = t.clone();
		
		// display content as a tree
		Utils.displayTree("The original linked tree is: ", t); 
				
		// display content as a tree
		Utils.displayTree("The clone linked tree is: ", tClone); 
	}

}
