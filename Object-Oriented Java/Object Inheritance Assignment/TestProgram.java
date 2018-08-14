import java.util.Scanner;
public class TestProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("This program displays the info of different hollow geometric objects. Please select an object:"
				+ "\nPress 1 for Sphere\nPress 2 for Cylinder\nPress 3 for Cone\nPress 4 for Box\nIf you wish to exit the program, press 0.\n");
		
		//invoking objects
		Sphere sphere = new Sphere();
		Cylinder cylinder = new Cylinder();	
		Cone cone = new Cone();	
		Box box  = new Box();
			
		//declearing variables used to keep the loops running and stopping
		int object= 0;
		int mainLoop = 0 ;
		int loop = 0;
		
		double radius, height, depth, width, thickness; //declearing variables
		
		/**The following code reads the users input to choose object, and then reads the users input for different variables.
		A try-catch method is used for exception handling for every single variable the user can manipulate.
		If-else method is also used for every variable to achieve proper realistic objects. The user gets limitation based on their set variables**/
		
			while (mainLoop==0){ //Using a while loop to keep the program running until user wants to quit by pressing zero.
				loop=0;
				try{
					object = scan.nextInt();
					if (object==1){ //Testing with if else what object the user wants to create. Selects Sphere
						System.out.println("You have chosen a hollow Sphere. The material is Aluminium\n\nFirst of all, select thickness between 0,01 and 100 cm");
						while (loop==0){
							try{
								thickness=scan.nextDouble(); 
								sphere.setThickness(thickness); //Setting a new value to Sphere's thickness
								if(0.01<=thickness && thickness<=100){
									System.out.println("Enter radius between "+ (thickness+0.01) +"cm and 1000 cm:");
									while(loop==0){
										try{
											radius=scan.nextDouble();
											sphere.setRadius(radius); //Setting a new value to Sphere's radius
												if(thickness<radius && radius<=1000){
													System.out.println(sphere + "\nSelect a new object, or press 0 to exit"); //invoke toString
													loop=1; 
												}else{
													System.out.println("Radius is either equal or less than the objects thickness ("+ (thickness) +" cm), or more than 1000. Please try again.\n");
												}
											}
										catch (Exception ex) {
											scan.nextLine();
											System.out.println("Wrong input. Enter radius between "+ (thickness+0.01) +" cm and 1000 cm:");
										}
									}
								}else{
									System.out.println("Wrong input. Please enter a positive number between 0,01 and 100:");
									}
								}
							catch (Exception ex) {
								scan.nextLine();
								System.out.println("Wrong input. Please enter a positive number between 0,01 and 100:");
							}
						}		
					}else if (object==2){ //If user selects Cylinder
						System.out.println("You have chosen a Cylinder. The material is Tin\n\nFirst of all, select thickness between 0,01 and 100 cm:");
						while (loop==0){
							try{
								thickness=scan.nextDouble();
								cylinder.setThickness(thickness);
								if(0.01<=thickness && thickness<=100){
									System.out.println("Enter radius between "+ (thickness+0.01) +"cm and 1000 cm:");
									while (loop==0){
										try{
											radius=scan.nextDouble();
											cylinder.setRadius(radius);
											if(thickness<radius && radius<=1000){
												System.out.println("Enter height between "+ (thickness*2+0.01) +"cm and 1000 cm:");
												while(loop==0){
													try{
														height=scan.nextDouble();
														cylinder.setHeight(height);
														if (thickness<(0.5*height) && height<=1000){
															System.out.println(cylinder+ "\nSelect a new object, or press 0 to exit"); //invoke toString
															loop=1; 
														}else{
															System.out.println("Failed. The height of the object has to be more than twice as big as its thickness ("+ thickness +"cm) and less than 1000 cm. Please try again.\n");
														}
													}
													catch (Exception ex) {
														scan.nextLine();
														System.out.println("Wrong input. The height of the object has to be more than twice as bit as its thickness "+ (thickness) +" cm and 1000 cm:");
													}
												}
											}else{
												System.out.println("Radius is either equal or less than the objects thickness ("+ (thickness) +" cm), or more than 1000. Please try again.\n");
											}
										}
										catch (Exception ex) {
											scan.nextLine();
											System.out.println("Wrong input. Enter radius between "+ (thickness+0.01) +" cm and 1000 cm:");
										}
									}
								}else{
									System.out.println("Wrong input. Please enter a positive number between 0,01 and 100:");
								}
							}
							catch (Exception ex) {
								scan.nextLine();
								System.out.println("Wrong input. Please enter a positive number between 0,01 and 100:");
							}
						}
					}else if (object==3){ //If user selects Cone
						System.out.println("You have chosen a Cone. The material is Copper\n\nFirst of all, select thickness between 0,01 and 100 cm:");
						while (loop==0){
							try{
								thickness=scan.nextDouble();
								cone.setThickness(thickness);
								if(0.01<=thickness && thickness<=100){
									System.out.println("Enter radius between "+ (thickness+0.01) +"cm and 1000 cm:");
									while (loop==0){
										try{
											radius=scan.nextDouble();
											cone.setRadius(radius);
											if(thickness<radius && radius<=1000){
												System.out.println("Enter height between "+ (thickness*2+0.01) +"cm and 1000 cm:");
												while(loop==0){
													try{
														height=scan.nextDouble();
														cone.setHeight(height);
														if (thickness<(0.5*height) && height<=1000){
															System.out.println(cone + "\nSelect a new object, or press 0 to exit"); //invoke toString
															loop=1; 
														}else{
															System.out.println("Failed. The height of the object has to be more than twice as big as its thickness ("+ thickness +"cm) and less than 1000 cm. Please try again.\n");
														}
													}
													catch (Exception ex) {
														scan.nextLine();
														System.out.println("Wrong input. The height of the object has to be more than twice as bit as its thickness "+ (thickness) +" cm and 1000 cm:");
													}
												}
											}else{
												System.out.println("Radius is either equal or less than the objects thickness ("+ (thickness) +" cm), or more than 1000. Please try again.\n");
											}
										}
										catch (Exception ex) {
											scan.nextLine();
											System.out.println("Wrong input. Enter radius between "+ (thickness+0.01) +" cm and 1000 cm:");
										}
									}
								}else{
									System.out.println("Wrong input. Please enter a positive number between 0,01 and 100:");
								}
							}
							catch (Exception ex) {
								scan.nextLine();
								System.out.println("Wrong input. Please enter a positive number between 0,01 and 100:");
							}
						}
					}else if (object==4){ //If user selects Box
						System.out.println("You have chosen a Box. The material is Iron\n\nFirst of all, select thickness between 0,01 and 100 cm:");
						while (loop==0){
							try{	
								thickness=scan.nextDouble();
								box.setThickness(thickness);
								if(0.01<=thickness && thickness<=100){
									System.out.println("Enter height between "+ (thickness*2+0.01) +"cm and 1000 cm:");
									while (loop==0){
										try{
											height=scan.nextDouble();
											box.setHeight(height);
											if (thickness<(0.5*height) && height<=1000){
												System.out.println("Enter depth between "+ (thickness*2+0.01) +"cm and 1000 cm:");
												while (loop==0){
													try{
														depth=scan.nextDouble();
														box.setDepth(depth);
															if (thickness<(0.5*depth) && depth<=1000){
																System.out.println("Enter width between "+ (thickness*2+0.01) +"cm and 1000 cm:");
																while(loop==0){
																	try{
																		width=scan.nextDouble();
																		box.setWidth(width);
																		if(thickness<(0.5*width) && width<=1000){
																			System.out.println(box + "\nSelect a new object, or press 0 to exit"); //invoke toString
																			loop=1; 
																		}else{
																			System.out.println("Failed. The width of the object has to be more than twice as big as its thickness ("+ thickness +"cm) and less than 1000 cm. Please try again.\n");
																		}
																	}
																	catch (Exception ex) {
																		scan.nextLine();
																		System.out.println("Wrong input. The width of the object has to be more than twice as bit as its thickness "+ (thickness) +" cm and 1000 cm:");
																	}
																}
															}else{
																System.out.println("Failed. The depth of the object has to be more than twice as big as its thickness ("+ thickness +"cm) and less than 1000 cm. Please try again.\n");
															}
														}
													catch (Exception ex) {
														scan.nextLine();
														System.out.println("Wrong input. The depth of the object has to be more than twice as bit as its thickness "+ (thickness) +" cm and 1000 cm:");
														}
													}
												}else{
													System.out.println("Failed. The height of the object has to be more than twice as big as its thickness ("+ thickness +"cm) and less than 1000 cm. Please try again.\n");
												}
											}
										catch (Exception ex) {
											scan.nextLine();
											System.out.println("Wrong input. The height of the object has to be more than twice as bit as its thickness "+ (thickness) +" cm and 1000 cm:");
										}
									}
								}else{
									System.out.println("Wrong input. Please enter a positive number between 0,01 and 100:");
								}
							}
						catch (Exception ex) {
								scan.nextLine();
								System.out.println("Wrong input. Please enter a positive number between 0,01 and 100:");
							}
						}
					}else if (object==0){
						System.out.println("Program executed.");
						mainLoop = 1;
					}else{
						System.out.println("Wrong input.\nPress 1 for Sphere\nPress 2 for Cylinder\nPress 3 for Cone\nPress 4 for Box\nIf you wish to exit the program, press 0.");
					}		
				}
				catch (Exception ex) {
					scan.nextLine();
					System.out.println("Wrong input.\nPress 1 for Sphere\nPress 2 for Cylinder\nPress 3 for Cone\nPress 4 for Box\nIf you wish to exit the program, press 0.");
				}		
			}
		}	
	}

