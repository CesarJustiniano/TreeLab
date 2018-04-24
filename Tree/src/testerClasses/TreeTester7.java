package testerClasses;

import treeClasses.LinkedTree;

public class TreeTester7 {

	public static void main(String[] args) {
		LinkedTree<String> t = new LinkedTree<>(); 
		
		try {
			LinkedTree<String> tClone = t.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
