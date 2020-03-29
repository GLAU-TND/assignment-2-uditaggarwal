package solution_3;

public class ArrangingQueue {
    private int[] data;
    private int front,rear;
    private int size;
    public ArrangingQueue(int size) {
    	   this.size=size;
	        data =new int[this.size];
	        front=0;
	        rear=-1;
    }
    public boolean enqueue(int element) {
    	 boolean response=false;
	        if(!isFull()){
	            data[rear+1]=element; 
	            rear++;
	            response=true;
	           // sorting(); 
	        }
	        else {
	        	System.out.println("overflow at:"+element);
	        }
	        return response;
	}
    boolean isFull(){
    	   boolean response=false;
	        if(rear==size-1){
	            response=true;
	        }
	        return response;
    }
    
    public void sorting() {
		int c;
		for(int i=0 ; i< rear;i++){                                                      //sorting ascending
			for(int j=0; j<=rear-i-1;j++) {
				if(data[j+1]<data[j]) {                         
			c=data[j+1];
			data[j+1]=data[j];
			data[j]=c;
			}
		}
		}
		
	}
    
    public int dequeue() {
		 int response=0;
	        if(!isEmpty()){
	       
	         response=data[front++];
	        }
	        else
	        	System.out.println("queue is empty");
	        return response;
		
	}
	boolean isEmpty(){
		 boolean response=false;
	        if(front-1==rear){
	            response=true;
	        }
	        return response;
	}
	public void print() {
		sorting();
		System.out.println("Ascending queue");
		int k=0;
		for(int i=rear, j=front;i>=front;i--) {
			System.out.print("| "+"("+j+")"+"-->"+data[j]+"   |");
			if(k==0) {
				System.out.print("<--"+"FRONT ");
				k++;
				}
		 if(j==rear) {
				System.out.print("<--"+"REAR");
			}
			j++; 
		System.out.println();
		}
		System.out.println("--------------");
		
	}
}
