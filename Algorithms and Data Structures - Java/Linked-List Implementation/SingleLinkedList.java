
public class SingleLinkedList {
	
	private Node head;
	
	public int elementCount; 
	
public SingleLinkedList(){
	
	head = null;
	elementCount = 0;
	
}

public void deleteFirst(){ 
	
	if(head == null){
		System.out.println("No elements to delete");
	}else{
	System.out.println("First element (" + head + ") was deleted");
		head = head.next;	
	}
	elementCount --;
}

public void deleteLast(){ 
	
	//If list is empty
	if (head == null){
		System.out.println("No elements to delete");
	}
	//If list only consists 1 element
	if (elementCount == 1){
		System.out.println("Last element (" + head + ") was deleted");
		head = null;
		elementCount--;
	}
	
	if(head != null){
	Node node = head;
	
	//iterate through our LinkedList
	while (node.next != null){
		
		if(node.next.next == null){
			System.out.println("Last element (" + node.next + ") was deleted");
			node.next = null;
			elementCount--;
			return;
			}
		node = node.next;
		}
	}	
}

public void addFirst(int data){ 
	
	Node newNode = new Node (data);
	
	if (head == null){
			head = newNode;
			head.next = null;
			
		}else{
		//head = node
			newNode.next = head;
		    head = newNode;
		}
	elementCount ++;
}

public void addLast(int data){ 

	Node newNode = new Node (data);
	
	if (head == null){
		head = newNode;
		head.next = null;
	
	}else{
	
	Node node = head;
	
	//iterate through our LinkedList
	while (node != null){
		
		if(node.next == null){
			node.next = newNode;
			node.next.next = null;
			}
		node = node.next;
		}
	}
	elementCount++;
}

public void insertAfter(int item, int data){ 
	
	Node newNode = new Node (data);
	
	
	//If the list is empty
	if (head == null){
			System.out.println("Couldn't find element");
			
		}
	//If there's only 1 element in the list
	else if (elementCount == 1 && item == head.data){
		//head = node
		System.out.println("1 element bare");
			head.next = newNode;
			head.next.next = null;
	}
		//If item is the first item in the list	
	else if (item == head.data){
		//head = node
			newNode.next = head.next;
			head.next = newNode;
	
	}else { 
	
		Node node = head;
		while (item != node.data){
		
			node = node.next;
			
			if(node == null){
				System.out.println("Element not found. Check list to get the right node");
				return;
			}
			if(node.data == item){
			
				newNode.next = node.next;
				node.next = newNode;	
				}
			}
		}
	elementCount ++;
}

public void insertBefore(int item, int data){
	
	Node newNode = new Node (data);
	
	
	//If the list is empty
	if (head == null){
			System.out.println("Couldn't find element");
		}
	//If there's only 1 element in the list
	else if (elementCount == 1 && item == head.data){
		//head = node
		
		newNode.next = head;
	    head = newNode;	
			
	}
		//If item is the first item in the list	
	else if (item == head.data){
		//head = node
			newNode.next = head;
			head = newNode;	
	
	}else { 
		Node node = head;
		while (item != node.data){
			
			if(node.next.data == item){
			
				newNode.next = node.next;
				node.next = newNode;
				elementCount ++;
				return;
				}
			
			node = node.next;
			
			if(node.next == null){
				System.out.println("Element not found. Check list to get the right node.");
				break;
				}
			} 
		}
	elementCount ++;
}

public void delete(int data){
	
	if (head == null){
		System.out.println("Couldn't find element");
		return;
		}
	
	else if (elementCount == 1 && data == head.data){
		//head = node
		head = null;
		System.out.println(data + " deleted");
		elementCount --;
	}
	
	else if (data == head.data){
		//head = node
			System.out.println(data + " deleted");
			head = head.next;
			
			elementCount--;
	}else{ 
		
		Node node = head;
		
		while (data != node.data){
			
			if(node.next == null){
				System.out.println("Couldn't find element");
			break;
			}
		
			if(node.next.data == data){
				node.next = node.next.next;
				elementCount--;
				System.out.println(data + " deleted");
				break;
			}
			node = node.next;
		}	
	}
}

public void deleteMultiple(int data){
	
	int antall = howMany(data);
	
	for(int i=1; i<=antall;i++){
		delete(data);
		}
		if (antall == 0){
			System.out.println("No elements to delete");
		} else {
			System.out.println("Selected node (" + data + ") was deleted " + antall + " times");
		}
	}

public int howMany(int data){
	
	int antall = 0;
	
	if(head == null){

		return antall;
	}
	
	if (head.data == data){
		antall ++;
	}
	
	Node node = head;
	
	while (node.next != null){
		node = node.next;
		if(node.data == data){
			antall ++;
		}
	}
	return antall;
}
	
void print (){ 
	
	if(head == null)
		System.out.println("No elements to print.");
	
	if(head != null){
		System.out.println("Printing list...\n");
		Node node = head;
		
		System.out.print("Head: ");
		int e = elementCount;
		for(int i=0;i<=e/3;i++){
			for(int j=0;j<=4;j++){
					System.out.print(node + " -> " );
					if(node.next == null)
						return;
					node = node.next;
				}
			System.out.print("\n" +"      ");
			}	
		}	
	}
				
public void displayLength(){
	
	System.out.println("The list consists of " + elementCount + " nodes");
}

public void deleteList(){
		
		head = null;
		System.out.println("List deleted. " + elementCount + " node(s) was deleted");
		elementCount = 0;
	}

public void showMeny(){

	System.out.println("\nMENY\n\n1 : Delete first element.\n2 : Delete last element."
		+ "\n3 : Delete selected element. \n4 : Delete all selected element(s)."
		+ "\n5 : Add selected element at head. \n6 : Add selected element at tail."
		+ "\n7 : Add selected element after specified element."
		+ "\n8 : Add selected element before specified element."
		+ "\n9 : Print list lenght. \n10: Count number of selected element(s) in list"
		+ "\n11: Print list. \n12: Delete list. \n0: Exit Program.");
}
		
	

	
	
	
	
	





		



	
}