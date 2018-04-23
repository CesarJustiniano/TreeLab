package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		
		t.addRoot(4);
		Position<Integer> child1 = t.addChild(t.root(), 9);
		Position<Integer> child2 = t.addChild(t.root(), 20);
		
		t.addChild(child1, 7);
		t.addChild(child1, 10);
		
		Position<Integer> child21 = t.addChild(child2, 15);
		Position<Integer> child22 = t.addChild(child2, 21);
		
		t.addChild(child21, 12);
		Position<Integer> child211 = t.addChild(child21, 17);
		t.addChild(child211, 19);
		
		Position<Integer> child221 = t.addChild(child22, 40);
		
		t.addChild(child221, 30);
		t.addChild(child221, 45);
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		
		t.addRoot(4);
		Position<Integer> childL = t.addLeft(t.root(), 9);
		Position<Integer> childR = t.addRight(t.root(), 20);
		
		t.addLeft(childL, 7);
		t.addRight(childL, 10);
		
		Position<Integer> childRL = t.addLeft(childR, 15);
		Position<Integer> childRR = t.addRight(childR, 21);
		
		t.addLeft(childRL, 12);
		Position<Integer> childRLL = t.addRight(childRL, 17);
		t.addLeft(childRLL, 19);
		
		Position<Integer> childRRL = t.addRight(childRR, 40);
		
		t.addLeft(childRRL, 30);
		t.addRight(childRRL, 45);
		
		return t; 
	}


}
