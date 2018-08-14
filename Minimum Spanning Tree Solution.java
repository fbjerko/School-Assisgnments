import java.util.Scanner;

public class Oblig2FINAL {
		
//							 A  B  C  D  E  F  G
	static int [][] cost = {{0, 8,10,13, 0, 0, 0}, //A
							{8, 0, 0,11, 0, 0, 0}, //B
							{10,0, 0,13, 0, 0, 0}, //C
							{13,11,13,0,12, 0,11}, //D
							{0, 0, 0,12, 0, 5, 9}, //E
							{0, 0 ,0, 0, 5, 0, 7}, //F
							{0, 0, 0,11, 9, 7, 0}};//G
	
	 
	public void MST(int start){
		
		int low = Integer.MAX_VALUE;
		int index=0;
		int row=0;
		int counter=1;
		int total=0;
		int visited [] = new int [cost.length];
		boolean isItTrue []= new boolean[cost.length];
		
		//Sets the start node as visited
		visited[counter-1] = start; 
		isItTrue[start] = true;	
		
		while(visited[cost.length-1] == 0){ //Loop ends when all nodes are connected
		
			for(int r=0;r<counter;r++){
			
				for(int i=0;i<cost.length;i++) { //Finds lowest cost for neighbours of visited nodes	
					
				    if(low > cost[visited[r]][i] && cost[visited[r]][i] != 0 && isItTrue[i] == false) {
				    	
				       low = cost[visited[r]][i];
				       row=r;
					   index=i;
					   
				   	}
				}
			}
		
		//Setting the visited-array with value of visited nodes	
		visited[counter] = index;
		isItTrue[index] = true;	
		
		//Setting the selected cost to 0
		cost[visited[row]][index] = 0;
		cost[index][visited[row]]= 0;

		total = total + low;
		counter++; //Incrementing counter, so all neighbours of visited nodes gets checked.
		
		System.out.println((char)(visited[row]+65) + " and " + (char)(index+65) + " connected");
		System.out.println("Edge: " + low + "\n");
	
		low = Integer.MAX_VALUE; //Resetting the low value to max
		
		}
		
	System.out.println("Total: " + total + "\n");
	
	}

	public void printMap(){ //Printing map for the user at program start
		
		for(int i = 0; i < cost.length; i++)
		{
		    for(int b = 0; b < cost[i].length; b++)
		    {
		        System.out.print(cost[i][b]);
		        if(b < cost[i].length - 1) System.out.print(" ");
		    }
		    System.out.println();
		}
	}

	public static void main(String[] args){
		
		Oblig2FINAL map = new Oblig2FINAL();
		
		Scanner scan = new Scanner(System.in);
		
		boolean exit = false;
		
	while(exit==false){
	
		try{
			
			map.printMap();
			
			System.out.println("\nEnter starting node. Choose from 1-7.\n");
			
			int start=scan.nextInt()-1;
			
			map.MST(start);
			
			exit=true;
			
		}
		catch (Exception ex) {
			scan.nextLine();
			System.out.println("Wrong input.\n\n");
			}
		}
	}
}
	
	
	
	
	

