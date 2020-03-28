package solution_2;
public class PrePostTraverseChkMain {

	public static void main(String[] args) {
		PrePostTraverseChk ob=new PrePostTraverseChk();
		ob.insert(50);
		ob.insert(80);
		ob.insert(309);
		ob.insert(35);
		ob.insert(100);
		ob.insert(70);
		ob.insert(12);
		ob.insert(34);
		System.out.println("PRE ORDER TRAVERSE");
		ob.traversePreOrder(ob.getRoot());
		System.out.println();
		System.out.println("POST ORDER TRAVERSE");
		ob.traversePostOrder(ob.getRoot());
		System.out.println(" both condtion are satisfy");

	}

}
