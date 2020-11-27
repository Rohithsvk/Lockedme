package lockedme;



	import java.util.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
	import java.util.Scanner;

	public class test1 
	{

		public static void main(String[] args) throws IOException
		{
			
			try 
			{
			
			
			System.out.println("                      ****************************************           ");
			System.out.println("                               Locked ME								 ");
			System.out.println("                      ****************************************           ");
			System.out.println("                      ****************************************           ");
			
			
			
			 while(true){
			
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
		    					Scanner sc1= new Scanner(System.in); 
		    					String data = sc1.nextLine();
		    					
		    					switch(data)
		    					{
		    									case "1":
		    									{
		    										
		    									try {	
		    										System.out.println("Enter the file name that you want to create:");		
		    				    					Scanner in = new Scanner (System.in);
		    				    					String filename= in.nextLine();
		    				    				
		    				    					File f= new File (filename);
		    				    						
		    				    					if (f.createNewFile()) {
		    				    						System.out.println( "File created :" +f.getName());
		    				    					}
		    				    					
		    				    					else {
		    				    							System.out.println( f.getName()+  ":File already exists ");
		    										
		    				    						}
		    										}
		    									catch(Exception e)  
		    		    						{  
		    		    							e.printStackTrace();  
		    		    						}
		    									
		    									}
		    						               break;
		    						               
		    									case "2":
		    									{
		    										try  
		    		    							{ 
		    		    	  	
		    		    							System.out.println("Enter the name of the file that you want to Delete:");
		    		    							Scanner sd1= new Scanner(System.in);
		    		    							String name= sd1.nextLine();
		    		    	  	
		    		    	  	
		    		    							File f1= new File(name);           //file to be delete  
		    		    							if(f1.delete())                      //returns Boolean value  
		    		    								{  
		    		    									System.out.println(f1.getName() + " is Sucessfully deleted");   //getting and printing the file name  
		    		    								}  
		    		    							else  
		    		    								{  
		    		    									System.out.println("fIle doesnt found in the directory");  
		    		    								}  
		    		    							}  
		    		    						catch(Exception e)  
		    		    						{  
		    		    							e.printStackTrace();  
		    		    						}
		    		    						
		    									}
		    									break;
		    								
		    									case "3":
		    									{
		    										
		    										class MyFilenameFilter implements FilenameFilter
		    										{ 
		    											
		    											String initials; 
		    											
		    											// constructor to initialize object 
		    											public MyFilenameFilter(String initials) 
		    											{ 
		    												this.initials = initials; 
		    											} 
		    											
		    											// overriding the accept method of FilenameFilter 
		    											// interface 
		    											public boolean accept(File dir, String name) 
		    											{ 
		    												return name.startsWith(initials); 
		    											} 
		    										} 
		    										
		    										System.out.println("You can search your file in the console");
		    		    							
		    		    							

		    		    							// Create an object of the File class 
		    		    							// Replace the file path with path of the directory 
		    		    							File directory11 = new File("C:\\Users\\REVANTH\\eclipse-workspace\\Project1"); 
		    		    							// Create an object of Class MyFilenameFilter 
		    		    							// Constructor with name of file which is being 
		    		    							// searched 
		    		    							System.out.println("Enter the file name to search:");
		    		    							Scanner sc11 = new Scanner(System.in);
		    		    							String name= sc11.nextLine();
		    		    							
		    		    	
		    		    							MyFilenameFilter filter = new MyFilenameFilter(name); 

		    		    						
		    		    							String[] flist = directory11.list(filter); 

		    		    						
		    		    							if (flist != null)
		    		    							{
		    		    								for (int i = 0; i < flist.length; i++)
		    		    								{ 
		    		    									System.out.println(flist[i]+" file found"); 
		    		    								} 
		    		    							
		    		    							}
		    		    								else 
		    		    								{
		    		    								System.out.println("File doesnt Found");
		    		    								} 
		    		    							
		    		    							
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
		    					
		    					
		    				
		    				
		    					
		    			
		    				}
		    				catch(Exception e)  
		    				{  
		    					e.printStackTrace();  
		    				}		
		    				
		    			}	
		    			
		    	
		    		break;
		    			
		    			case "3": 
		    			{
		    				System.out.println("Thank you and vist again...");
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
			 }	}
			
		    	catch(Exception e)  
		    			{  
		    				e.printStackTrace();  
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
}
