

class driver{





 public static void main(String[] args){
   MyLinkedList list = new MyLinkedList();
   
    System.out.println("My LinkedList implementation");
     list.Add(10);
	 list.Add(20);
	 list.Add(25);
	 list.Add(30);
	 list.Add(40);
	 list.Add(25);
	 list.Add(50);
	 
	 System.out.println("The first List");
	 list.PrintList();
	 System.out.println("The List with removed element");
	  list.Pop(25);
	 list.PrintList();
	 
  } 






}