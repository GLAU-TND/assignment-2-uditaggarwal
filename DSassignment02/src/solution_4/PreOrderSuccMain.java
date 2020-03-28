package solution_4;

public class PreOrderSuccMain {

	public static void main(String[] args) {
		BST ob=new BST();
		ob.insert(40);
		ob.insert(46);
		ob.insert(30);
		ob.insert(20);
		ob.insert(670);
		ob.insert(990);
		ob.insert(1562);
		ob.insert(35);
		ob.traversePreOrder(ob.getRoot());
		ob.printQueue();
		System.out.println("Thanks");
	}

}
