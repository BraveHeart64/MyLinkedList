



class MyLinkedList{

 Node head = null;
 Node tail = null;


 public void Add(int val){
	Node node = new Node(val,null);
	
	if(head == null){
		
		 head = node;
		 tail = head;
	}
	 else{
		 
		 
		 tail.next = node;
		 tail=tail.next;
		   
	 }
	 
 }

  public void PrintList(){
	  Node temphead = head;
	
	  

	  while(temphead != null){
		  System.out.println("Node value is : "+ temphead.value);
		  temphead = temphead.next;
	  }
	  	
	 
	  
  }
  
  public void Pop(int value){
	  Node temphead   = head;
	  while(temphead.next != null){
		  if(temphead.next.value == value){ 
			   temphead.next = temphead.next.next;
			 
		  }
		
		  temphead = temphead.next;
	  
    }
  
  }
 


}