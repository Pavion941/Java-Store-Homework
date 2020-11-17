/********************************************************************
 File Name: Menu.java
 
 Input Variables: choice
 Output Variables: none
 
 Description: Displays Menu w/ items
              Lets user select items until exit command issued
	      Handles input mismatch exception
Author/Date: Brett Wilson 9/22/2020
********************************************************************/
package com.mycompany.sneakerstore;

import java.util.*;

public class Store 
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        double subTotal = 0;
        double Total = 0;
        int pause = 0;
        
        while (choice != 10)
        {
            System.out.printf("Enter the number of the item you want or 10 to exit: \n");
            System.out.printf("1. Off-White Jordan 1 UNC - $2000\n2. Jordan 1 Origin Story - $650\n3. Jordan 3 Black Cement - $430\n4. Jordan 3 Tinker Hatfield - $230\n5. Adidas Yeezy Zebra - $400\n");
            System.out.printf("6. Adidas Yeezy Blue Tint - $570\n7. North Face Old Skool Vans - $300\n8. Vans Old Skool 80's Mickey - $175\n9. Vans Old Skool Charlie Brown - $230\n10. Total cost and EXIT.\n");
            try
            {
                choice = input.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input type.");		
                input.next();
		//input.next() is needed because of an API issue. 
		//If this line is not included the code will infinite loop
		//because the scanner does not discard the token and keeps testing over and over.
		//The scanner needs to be explicitly told to discard and move on.
                continue;
            }
            
            switch (choice) 
            { 
                case 1: 
                    subTotal += 2000;
                    System.out.printf("Subtotal: $%.2f%n", subTotal);
                    System.out.printf("Press any button to continue: \n");
                    try
                    {
                        pause = input.nextInt();
                    }
                    catch(InputMismatchException e)
                    {		
                        input.next();
                        continue;
                    }
                    break; 
                case 2: 
                    subTotal += 650;
                    System.out.printf("Subtotal: $%.2f%n", subTotal);
                    System.out.printf("Press any button to continue: \n");
                    try
                    {
                        pause = input.nextInt();
                    }
                    catch(InputMismatchException e)
                    {		
                        input.next();
                        continue;
                    }
                    break; 
                case 3: 
                    subTotal += 430;
                    System.out.printf("Subtotal: $%.2f%n", subTotal);
                    System.out.printf("Press any button to continue: \n");
                    try
                    {
                        pause = input.nextInt();
                    }
                    catch(InputMismatchException e)
                    {		
                        input.next();
                        continue;
                    }
                    break; 
                case 4: 
                    subTotal += 230;
                    System.out.printf("Subtotal: $%.2f%n", subTotal);
                    System.out.printf("Press any button to continue: \n");
                    try
                    {
                        pause = input.nextInt();
                    }
                    catch(InputMismatchException e)
                    {		
                        input.next();
                        continue;
                    }
                    break; 
                case 5: 
                    subTotal += 400;
                    System.out.printf("Subtotal: $%.2f%n", subTotal);
                    System.out.printf("Press any button to continue: \n");
                    try
                    {
                        pause = input.nextInt();
                    }
                    catch(InputMismatchException e)
                    {		
                        input.next();
                        continue;
                    }
                    break; 
                case 6: 
                    subTotal += 570;
                    System.out.printf("Subtotal: $%.2f%n", subTotal);
                    System.out.printf("Press any button to continue: \n");
                    try
                    {
                        pause = input.nextInt();
                    }
                    catch(InputMismatchException e)
                    {		
                        input.next();
                        continue;
                    }
                    break; 
                case 7: 
                    subTotal += 300;
                    System.out.printf("Subtotal: $%.2f%n", subTotal);
                    System.out.printf("Press any button to continue: \n");
                    try
                    {
                        pause = input.nextInt();
                    }
                    catch(InputMismatchException e)
                    {		
                        input.next();
                        continue;
                    }
                    break; 
                case 8: 
                    subTotal += 175;
                    System.out.printf("Subtotal: $%.2f%n", subTotal);
                    System.out.printf("Press any button to continue: \n");
                    try
                    {
                        pause = input.nextInt();
                    }
                    catch(InputMismatchException e)
                    {		
                        input.next();
                        continue;
                    }
                    break; 
                case 9: 
                    subTotal += 230;
                    System.out.printf("Subtotal: $%.2f%n", subTotal);
                    System.out.printf("Press any button to continue: \n");
                    try
                    {
                        pause = input.nextInt();
                    }
                    catch(InputMismatchException e)
                    {		
                        input.next();
                        continue;
                    }
                    break; 
                case 10:
                    Total = subTotal + (subTotal*0.07);
                    System.out.printf("Total: $%.2f%n", Total);
                    break;
                default:
                    System.out.printf("Error: Invalid Input.\n");       
            }  
        }
    }   
}
