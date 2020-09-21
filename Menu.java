/********************************************************************
 File Name: Menu.java
 
 Input Variables: choice
 Output Variables: none
 
 Description: Displays Menu w/ items
              Lets user select items until exit command issued
			  Handles input mismatch exception

Author/Date: Brett Wilson 9/22/2020
********************************************************************/
package menu;

import java.util.*;

public class Menu 
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 10)
        {
            System.out.printf("Enter the number of the item you want or 10 to exit: \n");
            System.out.printf("1. Item 1\n2. Item 2\n3. Item 3\n4. Item 4\n5. Item 5\n");
            System.out.printf("6. Item 6\n7. Item 7\n8. Item 8\n9. Item 9\n10. EXIT.\n");
            try
            {
                choice = input.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input type.");
				//input.next() is needed because of an API issue. 
				//If this line is not included the code will infinite loop
				//because the scanner does not discard the token and keeps testing over and over.
				//The scanner needs to be explicitly told to discard and move on.
                input.next();  
                continue;
            }
            
            switch (choice) 
            { 
                case 1: 
                    System.out.println("Item 1 not implemented.");
                    break; 
                case 2: 
                    System.out.println("Item 2 not implemented.");  
                    break; 
                case 3: 
                    System.out.println("Item 3 not implemented."); 
                    break; 
                case 4: 
                    System.out.println("Item 4 not implemented.");
                    break; 
                case 5: 
                    System.out.println("Item 5 not implemented.");
                    break; 
                case 6: 
                    System.out.println("Item 6 not implemented.");
                    break; 
                case 7: 
                    System.out.println("Item 7 not implemented.");
                    break; 
                case 8: 
                    System.out.println("Item 8 not implemented."); 
                    break; 
                case 9: 
                    System.out.println("Item 9 not implemented."); 
                    break; 
                case 10:
                    break;
                default:
                    System.out.printf("Error: Invalid Input.\n");       
            }  
        }
    }
}
