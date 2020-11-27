package lockedme;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;

public class mainMenu 
{

	public static void main(String[] args) throws IOException
	{
		
		try 
		{
		
		
		System.out.println("                      ****************************************           ");
		System.out.println("                               Locked ME								 ");
		System.out.println("                      ****************************************           ");
		System.out.println("                      ****************************************           ");
		
		
		
		// while(true){
		
			System.out.println("Enter 1: For list of Files In the Directory");
			System.out.println("Enter 2: For Bussines Operations In the Directory");
			System.out.println("Enter 3: For Closing the Application");
			
			Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	    	System.out.print("Enter Your choice:- ");  
	    	String a= sc.next();  
	    	
	    	switch (a)
	    	{
	    			case "1": 
	    			{
	    				System.out.println("List of Files in the Direcorty in Ascending Order");
	    			}
	    			break;
	    			
	    			case "2": 
	    			{
	    				 //switch2();
	    				
	    				try {
	    					
	    					
	    					System.out.println("********");
	    					System.out.println("Enter 1: to Create a file");
	    					System.out.println("Enter 2: to Delete a file");
	    					System.out.println("Enter 3: to Search a file");
	    					System.out.println("Enter 4: Exit");
	    					System.out.println("Enter your option::");
	    					Scanner da = new Scanner(System.in);
	    					String data = da.nextLine();
	    					
	    					switch(data)
	    					{
	    									case "1":
	    									{
	    										System.out.println("Thanks for ur visit.1");
	    										//createFile();
	    										
	    									}
	    						               break;
	    									case "2":
	    									{
	    										System.out.println("Thanks for ur visit.2");
	    										//delFile();
	    									}
	    						               break;
	    									case "3":
	    									{
	    										System.out.println("Thanks for ur visit.3");
	    										//searchFile();
	    									}
	    						               break;
	    									case "4":
	    									{
	    									
	    										System.out.println("Thanks for ur visit.4");
	    										
	    										
	    									}
	    									break;
	    									default :
	    									{
	    										System.out.println("You entered invalid Inputs... Please enter valid inputs");
	    									}
	    					}
	    					
	    					
	    					da.close();
	    				
	    					
	    			
	    				}
	    				catch(Exception e)  
	    				{  
	    					e.printStackTrace();  
	    				}		
	    				
	    			}	
	    		break;
	    			
	    			case "3": 
	    			{
	    				
	    			}
	    			break;
	    			
	    			default:
	    			{
	    				System.out.println("You have Entered the invalid Inputs.");
	    				System.out.println("Please enter only 1 or 2 or 3 only.");
	    				System.out.println("Thank you...");
	    			}
	    	
	    			
	    	}
	    	System.out.println(" ");
			System.out.println("");
		sc.close();
		
		}
	    	catch(Exception e)  
	    			{  
	    				e.printStackTrace();  
	    			}		
				
	    			
		}
	}

	
	/*

//************************************************
	// Switch Statement 2
		public static void switch2() throws IOException
		{
			
		try {
			
			
			System.out.println("********");
			System.out.println("Enter 1: to Create a file");
			System.out.println("Enter 2: to Delete a file");
			System.out.println("Enter 3: to Search a file");
			System.out.println("Enter 4: Exit");
			System.out.println("Enter your option::");
			Scanner da = new Scanner(System.in);
			String data = da.nextLine();
			
			switch(data)
			{
							case "1":
							{
								System.out.println("Thanks for ur visit.");
								//createFile();
								
							}
				               break;
							case "2":
							{
								System.out.println("Thanks for ur visit.");
								//delFile();
							}
				               break;
							case "3":
							{
								System.out.println("Thanks for ur visit.");
								//searchFile();
							}
				               break;
							case "4":
							{
								System.out.println("Thanks for ur visit.");
								
								
							}
							break;
							default :
							{
								System.out.println("You entered invalid Inputs... Please enter valid inputs");
							}
			}
			
			
			da.close();
		
			
	
		}
		catch(Exception e)  
		{  
			e.printStackTrace();  
		}		
		
	}	
	
}
*/