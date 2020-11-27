package lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class display {

	public static void main(String [] args)
	{
		
	
		while(true)
					{
						System.out.println("Enter 1: For list of files in the Direcotry.");
						System.out.println("Enter 2: For Creating a file in the Direcotry");
		    			System.out.println("Enter 4: Close the Directory");
		    			System.out.println("Enter the correct option::__");
		    			Scanner sc= new Scanner(System.in);
		    			String in = sc.next();

		    				switch(in)
		    					{
		    						case "1": 
		    						{		
		    							
		    							System.out.println("Your file is Searched succesfully");
		    							
		    						}
		    						break;
		
		    						case "2":
		    						{
		    							
		    							System.out.println("Your file is Searched 22succesfully");
		    							//switch2();
				
		    						}
		    						break;
			
		    						case "3":
		    						{
		    							System.out.println("Your file is Searched succesfully");
		    						}
		    						break;
		    						default:
		    						{
		    							System.out.println("You have entered a invalid input");
		    						}
		
		    					}
		
		    				sc.close();
		    				System.out.println("");
		    				System.out.println("");
		
					}	
	}
				
}

		



/*	
	// methods calling from here.. here i have to perform 5 major operations
	
	1) List the files in ascending Order.
	2) Operations on files
		2.1) Add a file
		2.2) Delete a File
		2.3) Search a File
		2.4) Exit
	3) Close the Application
	
	
	
	
	
	
	
	/*
	// Switch Statement 2
	private static void switch2() throws IOException
	{
		System.out.println("Enter 1: to Create a file");
		System.out.println("Enter 2: to Delete a file");
		System.out.println("Enter 3: to Search a file");
		System.out.println("Enter 4: Exit");
		Scanner da = new Scanner(System.in);
		String data = da.nextLine();
		
		switch(data)
		{
						case "1":
						{
							//createFile();
							
						}
			               break;
						case "2":
						{
							//delFile();
						}
			               break;
						case "3":
						{
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
}		
	
	// 2.2
	private static void delFile() {
		// TODO Auto-generated method stub
		try  
		{ 

		System.out.println("Enter the name of the file that you want to Delete:");
		Scanner sc= new Scanner(System.in);
		String name= sc.nextLine();


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
	
	
//2.1
	private static void createFile() throws IOException
	{
		try {
			
		// TODO Auto-generated method stub
		System.out.println("Enter the file name that you want to create:");		
		Scanner in = new Scanner (System.in);
		String filename= in.nextLine();
	
		File f= new File (filename);
			
		if (f.createNewFile())
			{
			System.out.println( "File created :" +f.getName());
			}
		
		else 
			{
				System.out.println( f.getName()+  ":File already exists ");
			}
	
		in.close();
		}
		catch(Exception e)  
		{  
			e.printStackTrace();  
		}
		}
	    
	private static void searchFile() {
		// TODO Auto-generated method stub
		
	}
	
	
	//1
	private static void listfiles() throws IOException
	{
		// TODO Auto-generated method stub
	System.out.println("List of files in the directory");
	
	String dir ="C:\\Users\\REVANTH\\eclipse-workspace\\Phase1Project";
	File directory = new File(dir);
	File[] fileList = directory.listFiles();

	for(File file: fileList)
	{
		System.out.println(file.getName());
	}
	}

}	
*/