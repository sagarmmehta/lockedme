package registrationdemo;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
public class register
 {
     public static void main(String[] args) throws InterruptedException,IOException,FileNotFoundException
 {
    	 HashMap<String, String> newuser = new HashMap<>();
    	 HashMap<String, String> media = new HashMap<>();
    				
 try
        {
               FileOutputStream fos = new FileOutputStream("hashmap1.txt");
               ObjectOutputStream oos = new ObjectOutputStream(fos);
                newuser.put("sagar","abcd");
               oos.writeObject(newuser);
          	// boolean loopAgain = true;
                 Scanner scan = new Scanner(System.in);
              	System.out.print("create username:");
     	String username = scan.nextLine();
       	System.out.print("Enter password:");
       	String password = scan.nextLine();
            		  if(newuser.containsKey(username))
                                      {
         			System.out.println("the user already exists");
         			System.exit(0);
         		           }
         			else
         			{
         			System.out.println("new user created");
         			}
      		
       		
       		 			
       		newuser.put(username,password);
             
               oos.writeObject(newuser);
              // oos.close();
              // fos.close();
               
               System.out.println("Serialized HashMap data is saved in hashmap1.txt");
        }
catch(IOException ioe)
         {
               ioe.printStackTrace();
                                      }
 		
 		//for (int i = 0; i < 25; ++i) System.out.println();
 		
 		//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
 		
 		
 		System.out.println("welcome to lockedme.com");
 		
 		Scanner scan = new Scanner(System.in);
 		
 		System.out.println("enter the username ");
 		
 		String username1 = scan.nextLine();
 		
 		if(newuser.containsKey(username1))
 		{
 			System.out.println("Enter password");
 			 String password1 = scan.nextLine();                                                                   				  boolean b=newuser.containsValue(password1);
 				  if(b==true)
 			 
 			 System.out.println("welcome to locked me .com !!!");
 				  

 				  
 				  else {
 					  System.out.println("invalid password");
 				  System.exit(0);
 				  }
 		}
 		else {
 			System.out.println("invalid username");
 		}
 		 
 			 			   
 		
 		
 		
 		System.out.println("welcome to locked me - a place where you can store your passwords");
		System.out.println("press 1 for entering credentials 2 for display");
		//Scanner scan = new Scanner(System.in);
		Scanner input = new Scanner(System.in);		
		//int choice = input.nextInt();
		
		int choice = input.nextInt();
		while (choice != 1 && choice != 2 ) {
		    System.out.println("Invalid entry, press 1 or 2");
		    choice = input.nextInt();
		}
		
		switch (choice) {
		case 1:
		    
		    System.out.println("enter the credentials");
		    
		    System.out.println("Enter your facebook userid.");
            System.out.printf("Username: ");
            String user_fb = input.next().toUpperCase();
            System.out.printf("Password: ");
            String pass_fb = input.next();
            
            //Credential related to TWITTER
            System.out.println("Enter your Twitter userid.");
            System.out.printf("Username: ");
            String user_twtr = input.next().toUpperCase();
            System.out.printf("Password: ");
            String pass_twtr = input.next();
            
            //Credential related to LinkedIN
            System.out.println("Enter your Linkedin userid.");
            System.out.printf("Username: ");
            String user_lkd = input.next().toUpperCase();
            System.out.printf("Password: ");
            String pass_lkd = input.next();

		    
//		    Scanner input1 = new Scanner(System.in);
//		    
//		    int choice1 = input1.nextInt();
//		    switch (choice1) {
//		    case 1:
//		    	FileOutputStream fos = new FileOutputStream("facebook.txt");
//	               ObjectOutputStream oos = new ObjectOutputStream(fos);
//	                
//	                 Scanner scan1 = new Scanner(System.in);
//	              	System.out.print("enter username:");
//	     	String fusername = scan1.nextLine();
//	       	System.out.print("Enter password:");
//	       	String fpassword = scan1.nextLine();
            
           media.put(user_fb,pass_fb);
           media.put(user_twtr,pass_twtr);
           media.put(user_lkd,pass_lkd);	
           
           
           
           try
           {
                  FileOutputStream fos =
                     new FileOutputStream("passwords.txt");
                  ObjectOutputStream oos = new ObjectOutputStream(fos);
                  oos.writeObject(media);
                 // oos.close();
                 // fos.close();
                  System.out.printf("Serialized HashMap data is saved in passwords.txt");
           }catch(IOException ioe)
            {
                  ioe.printStackTrace();
            }
           break;
		
           
           
           
		case 2:
			
			HashMap<String,String> map = null;

			try
			      {
			         FileInputStream fis = new FileInputStream("passwords.txt");
			         ObjectInputStream ois = new ObjectInputStream(fis);
			         map = (HashMap) ois.readObject();
			         //ois.close();
			        // fis.close();
			      }catch(IOException ioe)
			      {
			         ioe.printStackTrace();
			         return;
			      }catch(ClassNotFoundException c)
			      {
			         System.out.println("Class not found");
			         c.printStackTrace();
			         return;
			      }
			      System.out.println("Deserialized HashMap..");
			      // Display content using Iterator
			      Set set = map.entrySet();
			      Iterator iterator = set.iterator();
			      while(iterator.hasNext()) 
			      {
			         Map.Entry mentry = (Map.Entry)iterator.next();
			         System.out.print("Username"+ mentry.getKey() + " & password: ");
			         System.out.println(mentry.getValue());
			      }
			      break;
			      
		default:
		    System.out.println("Invalid input.");
		}
 }
 }

			
           
	       	




		    	
		    	
		    	
		    
		
	
		
		
		
		
		
		
		
		
		    
			
		    	
		    	
		    	
		    	
 
 



 		


 		
 			
 		
 	
 	           
          
     
