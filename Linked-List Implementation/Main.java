
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SingleLinkedList list = new SingleLinkedList ();
		
		boolean exit = false;
		int menyValg;
		
		System.out.println("Welcome! Please choose command for this Single Linked List program.");
		
		list.showMeny();
	
		while(exit == false){
			
			try{

			menyValg = input.nextInt();
			
			
		if(menyValg == 0){
			exit = true;	
		}
			
		else if(menyValg == 1){ //Delete first
				
		
			list.deleteFirst();
			System.out.println("\nEnter new command. Press 13 to show menu.");
		}
		
		else if(menyValg == 2){ //Delete Last
			
			list.deleteLast();
			System.out.println("\nEnter new command. Press 13 to show menu.");
		}
		
		else if(menyValg == 3){ //Delete one elements with selected value
			
			System.out.println("Enter element to delete");
			int data = input.nextInt();
			list.delete(data);
			System.out.println("\nEnter new command. Press 13 to show menu.");
		}
		
		else if(menyValg == 4){ //Delete all elements with selected value
			
			System.out.println("Enter element(s) to delete");
			int data = input.nextInt();
			
			list.deleteMultiple(data);
			System.out.println("\nEnter new command. Press 13 to show menu.");
		}
		
		else if(menyValg == 5){ //add first
			
			System.out.println("Input element to add at the head of the list");
			int data = input.nextInt();
			list.addFirst(data);
			System.out.println(data + " was added to the head of the list");
			System.out.println("\nEnter new command. Press 13 to show menu.");
		}
			
		else if(menyValg == 6){ //add last
				
				System.out.println("Input element to add at the end of the list");
				int data = input.nextInt();
				list.addLast(data);
				System.out.println(data + " was added to the end of the list");
				System.out.println("\nEnter new command. Press 13 to show menu.");
			}
		
		else if(menyValg == 7){ //insert after
				
				System.out.println("After which item will you insert the new node?");
				int item = input.nextInt();
				System.out.println("Enter value of new node");
				int data = input.nextInt();
				
				list.insertAfter(item, data);
				System.out.println(data + " was added to the end of the list");
				
				System.out.println("\nEnter new command. Press 13 to show menu.");
			}
		
		else if(menyValg == 8){ //insert before
			
			System.out.println("Before which item will you insert the new node?");
			int item = input.nextInt();
			System.out.println("Enter value of new node");
			int data = input.nextInt();
			
			list.insertBefore(item, data);
			
			System.out.println(data + " was added to the end of the list");
			
			System.out.println("\nEnter new command. Press 13 to show menu.");
			
		}
		
		else if(menyValg == 9){ //list length
			
			list.displayLength();
			System.out.println("\nEnter new command. Press 13 to show menu.");
		}
		
		else if(menyValg == 10){ //count elements
			
			System.out.println("Enter element you wish to count");
			int data = input.nextInt();
			list.howMany(data);
			System.out.println("Selected element (" + data +") "
					+ "appears " + list.howMany(data) + " times in the list");
			
			System.out.println("\nEnter new command. Press 13 to show menu.");
		}
		
		else if(menyValg == 11){ //print list
		
			list.print();	
			
			System.out.println("\nEnter new command. Press 13 to show menu.");
		}
		
		else if(menyValg == 12){ //delete list
			
			list.deleteList();
			
			System.out.println("\nEnter new command. Press 13 to show menu.");
			
		}	
		else if(menyValg == 13){ //insert after
			
			list.showMeny();
		}	
	}
			catch (Exception ex) {
				input.nextLine();
				System.out.println("Wrong input.\n\nEnter new command. Press 13 to show menu.");
			}
		}	
	}
}


