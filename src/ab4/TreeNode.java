package ab4;

import java.util.ArrayList;
import java.util.List;
public class TreeNode<T> {
	   private T value = null;
	   private TreeNode[] childrens = new TreeNode[100];
	   private int childCount = 0;

	   //creez un nou nod
	    public TreeNode(T value) {
	        this.value = value;
	    }

	    //adaug un copil unui nod
	    public TreeNode addChild(T value) {
	        TreeNode newChild = new TreeNode(value); //creez nodul cu valoarea primita ca parametru
	        childrens[childCount++] = newChild; // il adaug in array-ul de copii din arbore
	        return newChild; // il returnez
	    }

	    //traversez tot arborele si afisez copiii si parintii
	    public void traverse(TreeNode obj) {
	        if (obj != null) { //daca obiectul primit ca parametru exista trec mai departe altfel ies din if si nu returnez nimic
	            for (int i = 0; i < obj.childCount; i++) { //parcurg copii obiectului pana la childCount care se incrementeaza mereu cand se apeleaza addChild
	                System.out.println(obj.childrens[i].value); // printez valoarea copilului
	                traverse(obj.childrens[i]); // apoi apelez iarasi functia de traversare pentru copiii copilului
	            }
	        }
	    }
	    //printez tot tree-ul
	    public void printTree(TreeNode obj) {
	        System.out.println(obj.value); //printez valoarea rootului
	        traverse(obj);	// traversez arborele si la fiecare pas printez copilul
	    }
	}