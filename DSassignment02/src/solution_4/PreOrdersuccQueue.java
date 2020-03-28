package solution_4;

public class PreOrdersuccQueue {
	 Node rear;                                                    //  rear
	    Node front;                                                         //front
	    
	    class Node{                                                        //node of queue
	    	private int data;
	    	private Node next;
	    	Node(int data){
	    		this.data=data;
	    	}
	    }

	public boolean push(int element) {                                              //store tree preorder successor
			Node n=new Node(element);
	    	 boolean response=false;
	    			if(rear==null) {
	    			rear=n;
	    			front=n;
	    			}
	    			else {
	    		rear.next=n;
	    		rear=n;
	    		
	    			}
	    		
	    			return response;
	    		}
	public void preOrderSuccessor()                                                        //print  tree preorder successor
	{
		Node c = front; 
				 
            while(c.next!=null) {
				System.out.print(c.next.data+" ");
				c=c.next;
             }
           System.out.print("not exit");
		
	 }
}
